package edu.practice.corejava.phase02.t10_classes_and_objects;

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

public class P02T10Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T10");
    }

    @Test void eachEquipmentHasItsOwnState() {
        var a = new P02T10Exercise.Equipment("RACKET-1");
        var b = new P02T10Exercise.Equipment("RACKET-2");
        assertEquals("RACKET-1", a.code());
        assertTrue(a.isAvailable());
        assertTrue(a.checkout());
        assertFalse(a.checkout());
        assertTrue(b.isAvailable());
        a.returnItem();
        assertTrue(a.isAvailable());
    }
}
