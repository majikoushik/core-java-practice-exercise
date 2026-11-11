package edu.practice.corejava.phase03.t27_regex;

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

public class P03T27Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P03T27");
    }

    @Test void enforcesTheEntireTagFormat() {
        assertTrue(P03T27Exercise.isValidAssetTag("ASSET-BOK-0123"));
        assertFalse(P03T27Exercise.isValidAssetTag("ASSET-bok-0123"));
        assertFalse(P03T27Exercise.isValidAssetTag("XASSET-BOK-0123"));
        assertFalse(P03T27Exercise.isValidAssetTag("ASSET-BOK-01234"));
        assertFalse(P03T27Exercise.isValidAssetTag(null));
    }
}
