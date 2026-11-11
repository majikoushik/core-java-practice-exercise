package edu.practice.corejava.phase02.t16_keywords;

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

public class P02T16Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T16");
    }

    @Test void determinesTierAndKeepsPassIdentity() {
        assertEquals("VIP", P02T16Exercise.passTier(new P02T16Exercise.VipPass("X1")));
        assertEquals("STANDARD", P02T16Exercise.passTier(new P02T16Exercise.StandardPass("X2")));
        assertEquals("UNKNOWN", P02T16Exercise.passTier("visitor"));
        assertEquals("UNKNOWN", P02T16Exercise.passTier(null));
        assertEquals("X1", new P02T16Exercise.VipPass("X1").id());
    }
}
