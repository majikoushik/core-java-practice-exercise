package edu.practice.corejava.phase01.t07_loops;

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

public class P01T07Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T07");
    }

    @Test void stopsAtTheFirstLateDay() {
        assertEquals(3, P01T07Exercise.openingOnTimeStreak(new int[]{0, -2, 0, 9, 0}));
        assertEquals(0, P01T07Exercise.openingOnTimeStreak(new int[]{3, 0}));
        assertEquals(0, P01T07Exercise.openingOnTimeStreak(new int[]{}));
    }
}
