package edu.practice.corejava.phase05.t40_lambdas;

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

public class P05T40Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T40");
    }

    @Test void createsReusableThresholdRules() {
        var predicate = P05T40Exercise.minimumPurchaseRule(500);
        assertTrue(predicate.test(new P05T40Exercise.Purchase("A", 500)));
        assertFalse(predicate.test(new P05T40Exercise.Purchase("B", 499)));
        assertTrue(P05T40Exercise.minimumPurchaseRule(0).test(new P05T40Exercise.Purchase("C", 0)));
    }
}
