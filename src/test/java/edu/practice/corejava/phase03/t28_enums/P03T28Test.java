package edu.practice.corejava.phase03.t28_enums;

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

public class P03T28Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T28");
    }

    @Test void preventsInvalidLifecycleTransitions() {
        assertTrue(P03T28Exercise.mayTransition(P03T28Exercise.OrderStage.CREATED, P03T28Exercise.OrderStage.PAID));
        assertTrue(P03T28Exercise.mayTransition(P03T28Exercise.OrderStage.PAID, P03T28Exercise.OrderStage.PACKED));
        assertFalse(P03T28Exercise.mayTransition(P03T28Exercise.OrderStage.CREATED, P03T28Exercise.OrderStage.SHIPPED));
        assertFalse(P03T28Exercise.mayTransition(P03T28Exercise.OrderStage.SHIPPED, P03T28Exercise.OrderStage.SHIPPED));
    }
}
