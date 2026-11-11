package edu.practice.corejava.phase07.t65_maven_build_tools;

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

public class P07T65Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T65");
    }

    @Test void readsProjectRatherThanDependencyCoordinates(@TempDir Path tempDir) throws Exception {
        Path pom = tempDir.resolve("pom.xml");
        Files.writeString(pom, """
            <project><modelVersion>4.0.0</modelVersion>
              <groupId>org.demo</groupId><artifactId>warehouse</artifactId><version>1.2.0</version>
              <dependencies><dependency><groupId>other</groupId>
              <artifactId>unrelated</artifactId><version>99</version></dependency></dependencies>
            </project>
            """);
        assertEquals("org.demo:warehouse:1.2.0", P07T65Exercise.projectCoordinates(pom));
    }
}
