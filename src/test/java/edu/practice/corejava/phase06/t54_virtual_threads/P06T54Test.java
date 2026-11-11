package edu.practice.corejava.phase06.t54_virtual_threads;

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

public class P06T54Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P06T54");
    }

    @Test void usesVirtualThreadsAndPreservesOrder() throws Exception {
        var tasks = List.<Callable<String>>of(
            () -> "A:" + Thread.currentThread().isVirtual(),
            () -> "B:" + Thread.currentThread().isVirtual());
        assertEquals(List.of("A:true", "B:true"), P06T54Exercise.runChecks(tasks));
    }
}
