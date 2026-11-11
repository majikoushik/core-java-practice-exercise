package edu.practice.corejava.phase06.t49_synchronization;

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

public class P06T49Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T49");
    }

    @Test void preservesEveryConcurrentIncrement() throws Exception {
        var counter = new P06T49Exercise.VisitCounter();
        var executor = Executors.newFixedThreadPool(8);
        try {
            var tasks = new ArrayList<Callable<Void>>();
            for (int i = 0; i < 1000; i++) tasks.add(() -> { counter.increment(); return null; });
            for (Future<Void> f : executor.invokeAll(tasks)) f.get();
            assertEquals(1000, counter.value());
        } finally { executor.shutdownNow(); }
    }
}
