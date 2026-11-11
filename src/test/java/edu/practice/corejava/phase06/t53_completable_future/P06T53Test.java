package edu.practice.corejava.phase06.t53_completable_future;

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

public class P06T53Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T53");
    }

    @Test void combinesResultsAndPropagatesFailures() {
        var name = new CompletableFuture<String>();
        var points = new CompletableFuture<Integer>();
        var combined = P06T53Exercise.combineCustomerPoints(name, points);
        assertFalse(combined.isDone());
        name.complete("Ava"); points.complete(140);
        assertEquals("Ava:140", combined.join());
        var failed = new CompletableFuture<String>();
        var other = CompletableFuture.completedFuture(2);
        var result = P06T53Exercise.combineCustomerPoints(failed, other);
        failed.completeExceptionally(new IllegalStateException("offline"));
        assertThrows(CompletionException.class, result::join);
    }
}
