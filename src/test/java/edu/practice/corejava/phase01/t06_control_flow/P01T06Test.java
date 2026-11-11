package edu.practice.corejava.phase01.t06_control_flow;

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

public class P01T06Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T06");
    }

    @Test void appliesTheAdmissionPolicy() {
        assertEquals("FREE", P01T06Exercise.admissionDecision(5, false));
        assertEquals("ADMIT", P01T06Exercise.admissionDecision(26, true));
        assertEquals("DENY", P01T06Exercise.admissionDecision(26, false));
    }
    @Test void routesRequestTypes() {
            assertEquals("PAYMENT", P01T06Exercise.helpdeskRoute("billing"));
            assertEquals("SUPPORT", P01T06Exercise.helpdeskRoute("technical"));
            assertEquals("GENERAL", P01T06Exercise.helpdeskRoute("unknown"));
        }
}
