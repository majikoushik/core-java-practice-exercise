package edu.practice.corejava.phase04.t29_collection_hierarchy;

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

public class P04T29Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T29");
    }

    @Test void countsIssuesAndPreservesFirstSeenOrder() {
        var output = P04T29Exercise.frequencyByIssue(List.of("refund", "delay", "refund"));
        assertEquals(Map.of("refund", 2, "delay", 1), output);
        assertEquals(List.of("refund", "delay"), new ArrayList<>(output.keySet()));
    }
}
