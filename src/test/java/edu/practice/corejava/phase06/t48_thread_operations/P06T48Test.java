package edu.practice.corejava.phase06.t48_thread_operations;

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

public class P06T48Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T48");
    }

    @Test void distinguishesFinishedAndRunningWorkers() throws Exception {
        var completed = new Thread(() -> {});
        completed.start();
        assertTrue(P06T48Exercise.awaitCompletion(completed, 1000));
        var release = new CountDownLatch(1);
        var blocked = new Thread(() -> { try { release.await(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); } });
        blocked.start();
        try { assertFalse(P06T48Exercise.awaitCompletion(blocked, 10)); }
        finally { release.countDown(); blocked.join(1000); }
    }
}
