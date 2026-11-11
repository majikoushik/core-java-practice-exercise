package edu.practice.corejava.phase03.t24_custom_exceptions;

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

public class P03T24Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T24");
    }

    @Test void reportsDomainSpecificFailureData() {
        assertEquals(3, P03T24Exercise.reserve(8, 5));
        var ex = assertThrows(P03T24Exercise.QuotaExceededException.class,
            () -> P03T24Exercise.reserve(4, 7));
        assertEquals(7, ex.requested());
        assertEquals(4, ex.available());
    }
}
