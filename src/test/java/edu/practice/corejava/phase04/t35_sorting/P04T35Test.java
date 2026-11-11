package edu.practice.corejava.phase04.t35_sorting;

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

public class P04T35Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T35");
    }

    @Test void naturalAndCustomOrderDiffer() {
        var a = new P04T35Exercise.Employee("Zara", "Ops", 5);
        var b = new P04T35Exercise.Employee("Ava", "Eng", 8);
        var c = new P04T35Exercise.Employee("Ben", "Eng", 5);
        var natural = new ArrayList<>(List.of(a, c, b));
        Collections.sort(natural);
        assertEquals(List.of(b, c, a), natural);
        assertEquals(List.of(b, c, a), P04T35Exercise.teamDirectory(List.of(a, c, b)));
    }
}
