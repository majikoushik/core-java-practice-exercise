package edu.practice.corejava.phase03.t22_wrappers;

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

public class P03T22Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T22");
    }

    @Test void distinguishesMissingFromZero() {
        assertNull(P03T22Exercise.parseOptionalCount(null));
        assertNull(P03T22Exercise.parseOptionalCount("  "));
        assertEquals(0, P03T22Exercise.parseOptionalCount(" 0 "));
        assertEquals(123, P03T22Exercise.parseOptionalCount("123"));
        assertThrows(IllegalArgumentException.class, () -> P03T22Exercise.parseOptionalCount("-5"));
        assertThrows(IllegalArgumentException.class, () -> P03T22Exercise.parseOptionalCount("abc"));
    }
}
