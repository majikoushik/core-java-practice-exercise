package edu.practice.corejava.phase01.t04_types_and_casting;

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

public class P01T04Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T04");
    }

    @Test void handlesFractionalAndLargeQuotas() {
        assertEquals(1572864L, P01T04Exercise.quotaInBytes(1.5));
        assertEquals(5368709120L, P01T04Exercise.quotaInBytes(5120.0));
    }
}
