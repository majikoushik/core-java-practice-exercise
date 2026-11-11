package edu.practice.corejava.phase05.t39_functional_interfaces;

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

public class P05T39Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T39");
    }

    @Test void worksWithDifferentInjectedRules() {
        var a = new P05T39Exercise.Applicant("A", 71);
        var b = new P05T39Exercise.Applicant("B", 58);
        var all = List.of(a, b);
        assertEquals(List.of(a), P05T39Exercise.eligibleApplicants(all, applicant -> applicant.testScore() >= 70));
        assertEquals(all, P05T39Exercise.eligibleApplicants(all, applicant -> true));
    }
}
