package edu.practice.corejava.phase02.t19_nested_classes;

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

public class P02T19Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T19");
    }

    @Test void supportsStaticAndEnclosingContext() {
        assertEquals("BADGE-A7", new P02T19Exercise.Badge("A7").label());
        var pass = new P02T19Exercise.ConferencePass("Mira");
        var attendance = pass.new AttendanceEntry("Keynote");
        assertEquals("Mira:Keynote", attendance.summary());
    }
}
