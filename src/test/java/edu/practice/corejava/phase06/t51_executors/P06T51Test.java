package edu.practice.corejava.phase06.t51_executors;

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

public class P06T51Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T51");
    }

    @Test void returnsResultsInSubmissionOrder() throws Exception {
        assertEquals(List.of(8, 2, 12), P06T51Exercise.doubleWithWorkers(List.of(4, 1, 6), 2));
        assertEquals(List.of(), P06T51Exercise.doubleWithWorkers(List.of(), 2));
    }
}
