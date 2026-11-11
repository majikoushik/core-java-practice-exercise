package edu.practice.corejava.phase05.t41_method_references;

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

public class P05T41Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T41");
    }

    @Test void cleansAndSortsTheDirectory() {
        var names = List.of(" Zoe ", "", " Anna", "Ben ");
        assertEquals(List.of("Anna", "Ben", "Zoe"), P05T41Exercise.cleanDirectory(names));
        assertEquals(4, names.size());
    }
}
