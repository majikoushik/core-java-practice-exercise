package edu.practice.corejava.phase04.t36_generics;

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

public class P04T36Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T36");
    }

    @Test void maintainsTypesAndAcceptsMultipleNumericSubtypes() {
        assertEquals("B", P04T36Exercise.lastOrDefault(List.of("A", "B"), "X"));
        assertEquals(99, P04T36Exercise.lastOrDefault(List.<Integer>of(), 99));
        assertEquals(6.0, P04T36Exercise.sumMetrics(List.of(1, 2, 3)), 0.00001);
        assertEquals(4.5, P04T36Exercise.sumMetrics(List.of(1.5, 3.0)), 0.00001);
    }
}
