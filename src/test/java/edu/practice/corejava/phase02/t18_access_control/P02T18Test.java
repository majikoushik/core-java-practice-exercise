package edu.practice.corejava.phase02.t18_access_control;

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

public class P02T18Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T18");
    }

    @Test void fieldsHaveExactlyTheRequiredVisibility() throws Exception {
        Class<?> c = P02T18Exercise.CustomerRecord.class;
        assertTrue(Modifier.isPrivate(c.getDeclaredField("secretPin").getModifiers()));
        assertTrue(Modifier.isProtected(c.getDeclaredField("accountTier").getModifiers()));
        int flags = c.getDeclaredField("branchCode").getModifiers();
        assertFalse(Modifier.isPublic(flags) || Modifier.isPrivate(flags) || Modifier.isProtected(flags));
        assertTrue(Modifier.isPublic(c.getDeclaredField("publicName").getModifiers()));
    }
}
