package edu.practice.corejava.testkit;

import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.*;

/** Sanity check: does not depend on student implementations. */
public class ProjectHealthTest {
    @Test
    void everyTopicHasAnExerciseProgressFlag() throws Exception {
        var progress = new Properties();
        try (InputStream input = getClass().getResourceAsStream("/exercise-progress.properties")) {
            assertNotNull(input);
            progress.load(input);
        }
        assertEquals(65, progress.size());

        int[][] topicRanges = {
            {1, 9}, {10, 20}, {21, 28}, {29, 38},
            {39, 46}, {47, 54}, {55, 65}
        };
        for (int phase = 1; phase <= topicRanges.length; phase++) {
            int[] range = topicRanges[phase - 1];
            for (int topic = range[0]; topic <= range[1]; topic++) {
                String id = String.format("P%02dT%02d", phase, topic);
                assertTrue(progress.containsKey(id), id);
                String flag = progress.getProperty(id);
                assertTrue("true".equals(flag) || "false".equals(flag), id);
            }
        }
    }
}
