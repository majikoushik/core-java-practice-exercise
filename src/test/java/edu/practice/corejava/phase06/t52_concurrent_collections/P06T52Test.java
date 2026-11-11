package edu.practice.corejava.phase06.t52_concurrent_collections;

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

public class P06T52Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T52");
    }

    @Test void countsHighVolumeVotesWithoutLoss() {
        var votes = new ArrayList<String>();
        for (int i = 0; i < 6000; i++) votes.add(i % 3 == 0 ? "A" : "B");
        assertEquals(Map.of("A", 2000, "B", 4000), P06T52Exercise.tallyVotes(votes));
        assertEquals(Map.of(), P06T52Exercise.tallyVotes(List.of()));
    }
}
