package edu.practice.corejava.phase01.t05_operators;

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

public class P01T05Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P01T05");
    }

    @Test void modifiesOnlyTheRequestedBit() {
        assertEquals(0b1110, P01T05Exercise.updatePermission(0b1010, 0b0100, true));
        assertEquals(0b1000, P01T05Exercise.updatePermission(0b1010, 0b0010, false));
        assertEquals(0b1010, P01T05Exercise.updatePermission(0b1010, 0b0100, false));
    }
}
