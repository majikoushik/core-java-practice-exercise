package edu.practice.corejava.phase05.t44_collectors;

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

public class P05T44Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T44");
    }

    @Test void groupsAndPartitionsCandidates() {
        var a = new P05T44Exercise.Candidate("A", "Pune", 19);
        var b = new P05T44Exercise.Candidate("B", "Delhi", 16);
        var c = new P05T44Exercise.Candidate("C", "Pune", 20);
        var input = List.of(a, b, c);
        assertEquals(Map.of("Pune", 2L, "Delhi", 1L), P05T44Exercise.countByCity(input));
        assertEquals(List.of(a, c), P05T44Exercise.partitionEligible(input).get(true));
        assertEquals(List.of(b), P05T44Exercise.partitionEligible(input).get(false));
    }
}
