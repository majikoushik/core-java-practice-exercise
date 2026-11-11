package edu.practice.corejava.phase01.t03_program_structure;

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

public class P01T03Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T03");
    }

    @Test void followsTheSharedIdentifierContract() {
        assertEquals("ART-2026-0007", P01T03Exercise.registrationId("ART", 2026, 7));
        assertEquals("MUS-2025-1200", P01T03Exercise.registrationId("MUS", 2025, 1200));
    }
}
