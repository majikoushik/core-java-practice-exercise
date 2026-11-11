package edu.practice.corejava.phase02.t13_inheritance;

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

public class P02T13Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T13");
    }

    @Test void subtypesCustomizeTheQuote() {
        P02T13Exercise.StandardShipment regular = new P02T13Exercise.StandardShipment(3);
        P02T13Exercise.StandardShipment express = new P02T13Exercise.ExpressShipment(3);
        assertEquals(36, regular.fee());
        assertEquals(111, express.fee());
    }
}
