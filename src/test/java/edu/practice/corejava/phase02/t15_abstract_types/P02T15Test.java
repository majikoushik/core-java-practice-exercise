package edu.practice.corejava.phase02.t15_abstract_types;

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

public class P02T15Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P02T15");
    }

    @Test void oneContractSupportsMultipleChannels() {
        P02T15Exercise.NotificationChannel email = new P02T15Exercise.EmailChannel();
        P02T15Exercise.NotificationChannel sms = new P02T15Exercise.SmsChannel();
        assertEquals("EMAIL:alice:Ready", email.deliver("alice", "Ready"));
        assertEquals("SMS:bob:Late", sms.deliver("bob", "Late"));
    }
    @Test void supportsAnAbstractAlertBaseType() {
            P02T15Exercise.BaseAlert alert = new P02T15Exercise.SystemAlert();
            assertEquals("SYS:Disk Full", alert.format("Disk Full"));
        }
}
