package edu.practice.corejava.phase07.t59_memory_management;

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

public class P07T59Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T59");
    }

    @Test void releasesTheRetainedPayload() throws Exception {
        var holder = new P07T59Exercise.PayloadHolder(new byte[2048]);
        assertEquals(2048, holder.currentSize());
        holder.release();
        assertEquals(0, holder.currentSize());
        var field = holder.getClass().getDeclaredField("payload");
        field.setAccessible(true);
        assertNull(field.get(holder));
    }
}
