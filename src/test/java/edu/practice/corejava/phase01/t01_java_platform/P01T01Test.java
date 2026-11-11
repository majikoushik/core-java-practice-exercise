package edu.practice.corejava.phase01.t01_java_platform;

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

public class P01T01Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T01");
    }

    @Test void reportsTheActualRuntime() {
        assertEquals("Java " + System.getProperty("java.specification.version") + " | "
            + System.getProperty("java.vm.name"), P01T01Exercise.runtimeBadge());
    }
}
