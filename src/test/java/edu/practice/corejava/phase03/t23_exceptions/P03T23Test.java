package edu.practice.corejava.phase03.t23_exceptions;

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

public class P03T23Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T23");
    }

    @Test void rejectsInvalidTransactions() {
        assertEquals(50, P03T23Exercise.debit(120, 70));
        assertThrows(IllegalArgumentException.class, () -> P03T23Exercise.debit(40, 41));
        assertThrows(IllegalArgumentException.class, () -> P03T23Exercise.debit(100, 0));
        assertThrows(IllegalArgumentException.class, () -> P03T23Exercise.debit(-2, 1));
    }
}
