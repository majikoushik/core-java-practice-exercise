package edu.practice.corejava.phase07.t58_jvm_architecture;

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

public class P07T58Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T58");
    }

    @Test void differentiatesBootstrapAndApplicationLoading() {
        assertEquals("bootstrap", P07T58Exercise.loaderLabel(String.class));
        String expected = P07T58Exercise.class.getClassLoader().getClass().getSimpleName();
        assertEquals(expected, P07T58Exercise.loaderLabel(P07T58Exercise.class));
    }
}
