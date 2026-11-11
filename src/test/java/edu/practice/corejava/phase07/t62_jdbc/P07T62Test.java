package edu.practice.corejava.phase07.t62_jdbc;

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

public class P07T62Test {
    @BeforeEach
    void requireExerciseActivated() {
        ExerciseGate.requireReady("P07T62");
    }

    @Test void transfersAndRollsBackInvalidOperations() throws Exception {
        try (var connection = DriverManager.getConnection("jdbc:h2:mem:transfer_" + UUID.randomUUID()
                + ";DB_CLOSE_DELAY=-1")) {
            try (var stmt = connection.createStatement()) {
                stmt.execute("CREATE TABLE accounts (id INT PRIMARY KEY, balance INT NOT NULL)");
                stmt.execute("INSERT INTO accounts VALUES (1, 500), (2, 80)");
            }
            P07T62Exercise.transfer(connection, 1, 2, 120);
            assertEquals(380, accountBalance(connection, 1));
            assertEquals(200, accountBalance(connection, 2));
            assertThrows(IllegalArgumentException.class, () -> P07T62Exercise.transfer(connection, 1, 2, 999));
            assertEquals(380, accountBalance(connection, 1));
            assertEquals(200, accountBalance(connection, 2));
            assertTrue(connection.getAutoCommit());
        }
    }
    private int accountBalance(Connection c, int id) throws SQLException {
        try (var stmt = c.prepareStatement("SELECT balance FROM accounts WHERE id = ?")) {
            stmt.setInt(1, id);
            try (var rs = stmt.executeQuery()) { assertTrue(rs.next()); return rs.getInt(1); }
        }
    }
}
