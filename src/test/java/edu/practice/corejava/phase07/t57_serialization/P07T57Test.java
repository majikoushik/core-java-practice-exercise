package edu.practice.corejava.phase07.t57_serialization;

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

public class P07T57Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T57");
    }

    @Test void roundTripsTrustedSessionState() throws Exception {
        var original = new P07T57Exercise.SessionSnapshot("session-7", 4);
        byte[] encoded = P07T57Exercise.encode(original);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);
        assertEquals(original, P07T57Exercise.decode(encoded));
    }
}
