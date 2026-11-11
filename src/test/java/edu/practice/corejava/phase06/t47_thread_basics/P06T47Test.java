package edu.practice.corejava.phase06.t47_thread_basics;

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

public class P06T47Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T47");
    }

    @Test void launchesWorkOnTheNamedThread() throws Exception {
        var executedOn = new AtomicReference<String>();
        Thread t = P06T47Exercise.launch("audit-worker", () -> executedOn.set(Thread.currentThread().getName()));
        t.join(1500);
        assertFalse(t.isAlive());
        assertEquals("audit-worker", executedOn.get());
    }
}
