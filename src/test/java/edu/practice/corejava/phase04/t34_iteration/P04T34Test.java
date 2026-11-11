package edu.practice.corejava.phase04.t34_iteration;

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

public class P04T34Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T34");
    }

    @Test void removesEntriesSafelyWhileTraversing() {
        var entries = new HashMap<>(Map.of("a", 4, "b", 5, "c", 8));
        assertEquals(2, P04T34Exercise.purgeExpired(entries, 5));
        assertEquals(Map.of("c", 8), entries);
    }
}
