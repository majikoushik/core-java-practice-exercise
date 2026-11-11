package edu.practice.corejava.phase04.t32_queues_and_deques;

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

public class P04T32Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T32");
    }

    @Test void respectsPriorityAndArrivalOrder() {
        var urgent = List.of("U1", "U2");
        var routine = List.of("R1", "R2");
        assertEquals(List.of("U1", "U2", "R1", "R2"), P04T32Exercise.serviceOrder(urgent, routine));
        assertEquals(List.of("R1", "R2"), P04T32Exercise.serviceOrder(List.of(), routine));
    }
}
