package edu.practice.corejava.phase03.t26_date_time;

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

public class P03T26Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T26");
    }

    @Test void crossesWeekendsCorrectly() {
        assertEquals(LocalDate.of(2026, 11, 16), P03T26Exercise.dispatchDate(LocalDate.of(2026, 11, 12), 2));
        assertEquals(LocalDate.of(2026, 11, 14), P03T26Exercise.dispatchDate(LocalDate.of(2026, 11, 14), 0));
    }
    @Test void convertsTimeZonesWithoutChangingTheInstant() {
            Instant original = Instant.parse("2026-11-11T12:00:00Z");
            var localized = P03T26Exercise.localizeInstant(original, ZoneId.of("Asia/Kolkata"));
            assertEquals(original, localized.toInstant());
            assertEquals(17, localized.getHour());
            assertEquals(30, localized.getMinute());
        }
}
