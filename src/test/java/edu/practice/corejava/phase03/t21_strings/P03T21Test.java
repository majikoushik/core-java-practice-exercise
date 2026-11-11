package edu.practice.corejava.phase03.t21_strings;

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

public class P03T21Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T21");
    }

    @Test void generatesStableSlugs() {
        assertEquals("java-in-production", P03T21Exercise.articleSlug("  Java   in Production "));
        assertEquals("", P03T21Exercise.articleSlug("   "));
        assertEquals("cloud", P03T21Exercise.articleSlug("CLOUD"));
    }
    @Test void buildsAnAuditLine() {
            assertEquals("LOGIN | READ | LOGOUT", P03T21Exercise.auditLine(List.of("LOGIN", "READ", "LOGOUT")));
            assertEquals("", P03T21Exercise.auditLine(List.of()));
        }
}
