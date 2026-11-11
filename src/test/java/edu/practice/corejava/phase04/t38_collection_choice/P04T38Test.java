package edu.practice.corejava.phase04.t38_collection_choice;

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

public class P04T38Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P04T38");
    }

    @Test void retainsOrderAndRemovesDuplicates() {
        var grants = List.of(new P04T38Exercise.Grant("reader", "view"),
            new P04T38Exercise.Grant("admin", "edit"), new P04T38Exercise.Grant("reader", "export"),
            new P04T38Exercise.Grant("reader", "view"));
        var result = P04T38Exercise.permissionsByRole(grants);
        assertEquals(List.of("reader", "admin"), new ArrayList<>(result.keySet()));
        assertEquals(List.of("view", "export"), new ArrayList<>(result.get("reader")));
    }
}
