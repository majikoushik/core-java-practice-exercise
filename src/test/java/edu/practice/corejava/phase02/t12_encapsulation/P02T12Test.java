package edu.practice.corejava.phase02.t12_encapsulation;

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

public class P02T12Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T12");
    }

    @Test void protectsTheBalanceInvariant() {
        var wallet = new P02T12Exercise.Wallet();
        wallet.deposit(300);
        wallet.spend(120);
        assertEquals(180, wallet.balance());
        assertThrows(IllegalArgumentException.class, () -> wallet.spend(181));
        assertEquals(180, wallet.balance());
        assertThrows(IllegalArgumentException.class, () -> wallet.deposit(0));
    }
}
