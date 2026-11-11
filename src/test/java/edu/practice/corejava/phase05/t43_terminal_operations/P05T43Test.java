package edu.practice.corejava.phase05.t43_terminal_operations;

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

public class P05T43Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T43");
    }

    @Test void calculatesAndQueriesPayments() {
        var rows = List.of(new P05T43Exercise.Payment(120, "CAPTURED"),
            new P05T43Exercise.Payment(999, "FAILED"), new P05T43Exercise.Payment(80, "CAPTURED"),
            new P05T43Exercise.Payment(30, "DISPUTED"));
        assertEquals(200L, P05T43Exercise.capturedRevenue(rows));
        assertTrue(P05T43Exercise.hasDispute(rows));
        assertFalse(P05T43Exercise.hasDispute(List.of()));
    }
}
