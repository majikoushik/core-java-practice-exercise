package edu.practice.corejava.phase04.t37_hashmap_internals;

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

public class P04T37Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T37");
    }

    @Test void retrievesEqualKeysAndSeparatesDistinctKeys() {
        var inventory = new HashMap<P04T37Exercise.StockKey, Integer>();
        inventory.put(new P04T37Exercise.StockKey("N", "A"), 10);
        inventory.put(new P04T37Exercise.StockKey("S", "A"), 20);
        assertEquals(10, P04T37Exercise.lookup(inventory, "N", "A"));
        assertEquals(20, P04T37Exercise.lookup(inventory, "S", "A"));
        assertEquals(0, P04T37Exercise.lookup(inventory, "W", "A"));
    }
}
