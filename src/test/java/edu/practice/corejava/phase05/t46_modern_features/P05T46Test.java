package edu.practice.corejava.phase05.t46_modern_features;

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

public class P05T46Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T46");
    }

    @Test void handlesEveryPermittedResponseVariant() {
        assertEquals("OK:T100:500", P05T46Exercise.describe(new P05T46Exercise.Success("T100", 500)));
        assertEquals("ERROR:403", P05T46Exercise.describe(new P05T46Exercise.Failure(403, "Forbidden")));
    }
}
