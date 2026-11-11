package edu.practice.corejava.phase01.t09_methods;

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

public class P01T09Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T09");
    }

    @Test void sumsVariableInvoices() {
        assertEquals(870L, P01T09Exercise.invoiceTotal(100, 250, 520));
        assertEquals(0L, P01T09Exercise.invoiceTotal());
    }
    @Test void evaluatesReferenceDigits() {
        assertEquals(14, P01T09Exercise.digitSum(590));
        assertEquals(0, P01T09Exercise.digitSum(0));
    }
}
