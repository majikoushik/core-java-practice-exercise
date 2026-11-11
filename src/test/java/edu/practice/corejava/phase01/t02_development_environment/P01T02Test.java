package edu.practice.corejava.phase01.t02_development_environment;

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

public class P01T02Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T02");
    }

    @Test void bothCapabilitiesAreRequired() {
        assertEquals("READY", P01T02Exercise.workstationStatus(true, true));
        assertEquals("SETUP_REQUIRED", P01T02Exercise.workstationStatus(true, false));
        assertEquals("SETUP_REQUIRED", P01T02Exercise.workstationStatus(false, true));
    }
}
