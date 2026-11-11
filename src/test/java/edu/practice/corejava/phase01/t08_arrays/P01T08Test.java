package edu.practice.corejava.phase01.t08_arrays;

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

public class P01T08Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T08");
    }

    @Test void summarizesEachRow() {
        assertArrayEquals(new int[]{2, 0, 3}, P01T08Exercise.availableSeatsPerRow(
            new int[][]{{0, 1, 0}, {1, 1}, {0, 0, 0}}));
        assertArrayEquals(new int[]{}, P01T08Exercise.availableSeatsPerRow(new int[][]{}));
    }
}
