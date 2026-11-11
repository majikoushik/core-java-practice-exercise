package edu.practice.corejava.testkit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/** Controls whether an unfinished student exercise is assessed. */
public final class ExerciseGate {
    private static final Properties PROGRESS = readProgress();
    private ExerciseGate() {}

    private static Properties readProgress() {
        var properties = new Properties();
        try (InputStream in = ExerciseGate.class.getResourceAsStream("/exercise-progress.properties")) {
            if (in == null) throw new IllegalStateException("Missing exercise-progress.properties");
            properties.load(in);
            return properties;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to read exercise progress", e);
        }
    }

    public static void requireReady(String exerciseId) {
        if (!PROGRESS.containsKey(exerciseId)) {
            throw new IllegalArgumentException("Unknown exercise: " + exerciseId);
        }
        String override = System.getProperty("exercise.run", "");
        boolean forced = exerciseId.equalsIgnoreCase(override) || "ALL".equalsIgnoreCase(override);
        boolean enabled = Boolean.parseBoolean(PROGRESS.getProperty(exerciseId, "false"));
        assumeTrue(forced || enabled,
            () -> exerciseId + " not yet activated; use -Dexercise.run=" + exerciseId
                + " or change its flag in exercise-progress.properties");
    }
}
