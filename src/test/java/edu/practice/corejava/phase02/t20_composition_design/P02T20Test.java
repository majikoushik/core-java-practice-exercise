package edu.practice.corejava.phase02.t20_composition_design;

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

public class P02T20Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T20");
    }

    @Test void collaboratesThroughInjectedInterfaces() {
        var messages = new ArrayList<String>();
        P02T20Exercise.Pricing pricing = amount -> amount + 25;
        P02T20Exercise.Messenger messenger = messages::add;
        var service = new P02T20Exercise.CheckoutService(pricing, messenger);
        assertEquals(525, service.checkout("Ava", 500));
        assertEquals(List.of("Ava:525"), messages);
    }
}
