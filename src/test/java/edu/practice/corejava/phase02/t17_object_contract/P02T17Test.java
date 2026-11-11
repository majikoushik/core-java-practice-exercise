package edu.practice.corejava.phase02.t17_object_contract;

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

public class P02T17Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T17");
    }

    @Test void implementsValueIdentity() {
        var a = new P02T17Exercise.CustomerKey("north", "42");
        var b = new P02T17Exercise.CustomerKey("north", "42");
        var c = new P02T17Exercise.CustomerKey("south", "42");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, c);
        assertEquals("north/42", a.toString());
    }
}
