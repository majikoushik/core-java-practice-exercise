package edu.practice.corejava.phase05.t45_optional;

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

public class P05T45Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T45");
    }

    @Test void representsMissingDataExplicitly() {
        assertEquals(Optional.of("a@b.org"), P05T45Exercise.verifiedEmail(new P05T45Exercise.Customer(" a@b.org ", true)));
        assertEquals(Optional.empty(), P05T45Exercise.verifiedEmail(new P05T45Exercise.Customer(" ", true)));
        assertEquals(Optional.empty(), P05T45Exercise.verifiedEmail(new P05T45Exercise.Customer("x@y.org", false)));
    }
}
