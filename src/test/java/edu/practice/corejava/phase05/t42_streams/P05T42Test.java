package edu.practice.corejava.phase05.t42_streams;

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

public class P05T42Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P05T42");
    }

    @Test void transformsFiltersAndDeduplicates() {
        var rows = List.of(new P05T42Exercise.CatalogEntry("ab1", true),
            new P05T42Exercise.CatalogEntry("cx2", false), new P05T42Exercise.CatalogEntry("AB1", true),
            new P05T42Exercise.CatalogEntry("dc3", true));
        assertEquals(List.of("AB1", "DC3"), P05T42Exercise.activeSkuExport(rows));
    }
}
