package edu.practice.corejava.phase03.t25_packages;

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

public class P03T25Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T25");
    }

    @Test void followsTheSharedCrossPackageContract() {
        assertEquals("ORG/ART", P03T25Exercise.departmentRoute(" art "));
        assertEquals("ORG/SPORT", P03T25Exercise.departmentRoute("SPORT"));
    }
}
