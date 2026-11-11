package edu.practice.corejava.phase04.t30_lists;

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

public class P04T30Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T30");
    }

    @Test void removesTheEarliestMatchWithoutMutatingInput() {
        var source = new ArrayList<>(List.of("A", "B", "A", "C"));
        assertEquals(List.of("B", "A", "C"), P04T30Exercise.removeFirstFromWaitlist(source, "A"));
        assertEquals(List.of("A", "B", "A", "C"), source);
        assertEquals(source, P04T30Exercise.removeFirstFromWaitlist(source, "Z"));
    }
}
