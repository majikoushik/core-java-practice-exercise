package edu.practice.corejava.phase07.t55_java_io;

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

public class P07T55Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T55");
    }

    @Test void handlesMultilineTextAndBlankLines() throws Exception {
        var input = new ByteArrayInputStream("100\n\n250\n 30 \n".getBytes(StandardCharsets.UTF_8));
        assertEquals(380L, P07T55Exercise.sumInvoiceLines(input));
        var bad = new ByteArrayInputStream("oops\n".getBytes(StandardCharsets.UTF_8));
        assertThrows(IllegalArgumentException.class, () -> P07T55Exercise.sumInvoiceLines(bad));
    }
}
