package edu.practice.corejava.phase06.t50_wait_notify;

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

public class P06T50Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T50");
    }

    @Test @Timeout(4) void releasesWaitingAndFutureWorkers() throws Exception {
        var gate = new P06T50Exercise.Gate();
        var started = new CountDownLatch(1);
        var executor = Executors.newSingleThreadExecutor();
        try {
            Future<Boolean> waiting = executor.submit(() -> { started.countDown(); gate.awaitOpen(); return true; });
            assertTrue(started.await(1, TimeUnit.SECONDS));
            assertThrows(TimeoutException.class, () -> waiting.get(75, TimeUnit.MILLISECONDS));
            gate.open();
            assertTrue(waiting.get(1, TimeUnit.SECONDS));
            gate.awaitOpen();
        } finally { executor.shutdownNow(); }
    }
}
