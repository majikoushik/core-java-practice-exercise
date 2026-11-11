package edu.practice.corejava.phase02.t14_polymorphism;

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

public class P02T14Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T14");
    }

    @Test void acceptsInterchangeablePolicies() {
        assertEquals(800, P02T14Exercise.totalAfterDiscount(1000, new P02T14Exercise.PercentDiscount(20)));
        assertEquals(950, P02T14Exercise.totalAfterDiscount(1000, new P02T14Exercise.FlatDiscount(50)));
        assertEquals(0, P02T14Exercise.totalAfterDiscount(20, new P02T14Exercise.FlatDiscount(100)));
    }
    @Test void usesTheNoPolicyOverload() {
            assertEquals(700, P02T14Exercise.totalAfterDiscount(700));
        }
}
