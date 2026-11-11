package edu.practice.corejava.phase07.t64_junit_and_debugging;

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

public class P07T64Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T64");
    }

    @Test void computesAndClampsRefundAmounts() {
        assertEquals(700, P07T64Exercise.refundAmount(1000, 200, 100));
        assertEquals(0, P07T64Exercise.refundAmount(100, 90, 50));
        assertEquals(0, P07T64Exercise.refundAmount(0, 0, 0));
    }
}
