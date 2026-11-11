package edu.practice.corejava.phase07.t61_annotations;

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

public class P07T61Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T61");
    }

    static class InvoiceService {
        @P07T61Exercise.Audited(action = "refund") void refund() {}
        void view() {}
        @P07T61Exercise.Audited(action = "charge") void charge() {}
    }
    @Test void extractsMethodMetadata() {
        assertEquals(List.of("charge", "refund"), P07T61Exercise.auditActions(InvoiceService.class));
    }
}
