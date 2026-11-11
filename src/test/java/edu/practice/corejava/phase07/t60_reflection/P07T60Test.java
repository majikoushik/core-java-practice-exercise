package edu.practice.corejava.phase07.t60_reflection;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.time.*;
import java.sql.*;
import java.lang.reflect.*;
import edu.practice.corejava.testkit.ExerciseGate;

public class P07T60Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T60");
    }

    static class ConfigSample {
        @P07T60Exercise.ConfigValue String host;
        int timeout;
        @P07T60Exercise.ConfigValue String region;
    }
    @Test void discoversAnnotatedFields() {
        assertEquals(List.of("host", "region"), P07T60Exercise.configuredFields(ConfigSample.class));
        assertEquals(List.of(), P07T60Exercise.configuredFields(String.class));
    }
}
