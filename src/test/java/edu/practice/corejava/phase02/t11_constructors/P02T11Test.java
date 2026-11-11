package edu.practice.corejava.phase02.t11_constructors;

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

public class P02T11Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T11");
    }

    @Test void supportsDefaultAndExplicitInitialization() {
        var basic = new P02T11Exercise.Campaign();
        assertEquals("Untitled", basic.name());
        assertEquals(0, basic.budget());
        var custom = new P02T11Exercise.Campaign("Orientation", 5000);
        assertEquals("Orientation", custom.name());
        assertEquals(5000, custom.budget());
    }
}
