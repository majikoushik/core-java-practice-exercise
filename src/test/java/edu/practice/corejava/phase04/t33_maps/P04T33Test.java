package edu.practice.corejava.phase04.t33_maps;

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

public class P04T33Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T33");
    }

    @Test void mergesWithNewProductsAndNoSideEffects() {
        var old = new HashMap<>(Map.of("A", 2, "B", 8));
        var added = Map.of("A", 3, "C", 4);
        assertEquals(Map.of("A", 5, "B", 8, "C", 4), P04T33Exercise.receiveStock(old, added));
        assertEquals(2, old.get("A"));
    }
}
