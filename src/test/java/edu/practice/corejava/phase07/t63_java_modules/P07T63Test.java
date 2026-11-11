package edu.practice.corejava.phase07.t63_java_modules;

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

public class P07T63Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T63");
    }

    @Test void describesAnExportedApiPackage() {
        var descriptor = P07T63Exercise.describeModule("org.demo.billing", "org.demo.billing.api");
        assertEquals("org.demo.billing", descriptor.name());
        assertEquals(1, descriptor.exports().size());
        assertEquals("org.demo.billing.api", descriptor.exports().iterator().next().source());
    }
}
