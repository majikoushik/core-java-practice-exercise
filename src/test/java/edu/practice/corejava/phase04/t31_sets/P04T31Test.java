package edu.practice.corejava.phase04.t31_sets;

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

public class P04T31Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T31");
    }

    @Test void preservesDuplicateDiscoveryOrder() {
        Set<String> duplicates = P04T31Exercise.duplicateBadgeIds(
            List.of("A", "B", "A", "C", "B", "A"));
        assertEquals(Set.of("A", "B"), duplicates);
        assertEquals(List.of("A", "B"), new ArrayList<>(duplicates));
        assertTrue(P04T31Exercise.duplicateBadgeIds(List.of("X", "Y")).isEmpty());
    }
}
