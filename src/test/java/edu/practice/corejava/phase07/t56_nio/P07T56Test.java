package edu.practice.corejava.phase07.t56_nio;

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

public class P07T56Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T56");
    }

    @Test void scansImmediateFilesOnly(@TempDir Path inbox) throws Exception {
        Files.writeString(inbox.resolve("b.csv"), "b");
        Files.writeString(inbox.resolve("a.csv"), "a");
        Files.writeString(inbox.resolve("notes.txt"), "x");
        Files.createDirectories(inbox.resolve("nested"));
        Files.writeString(inbox.resolve("nested").resolve("c.csv"), "x");
        assertEquals(List.of(inbox.resolve("a.csv"), inbox.resolve("b.csv")),
            P07T56Exercise.csvFilesInInbox(inbox));
    }
}
