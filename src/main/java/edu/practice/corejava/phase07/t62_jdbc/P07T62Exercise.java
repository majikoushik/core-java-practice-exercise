package edu.practice.corejava.phase07.t62_jdbc;

import java.util.*;
import java.util.function.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.time.*;
import java.sql.*;
import java.lang.annotation.*;
import java.lang.module.ModuleDescriptor;

/**
 * P07T62 — JDBC: Transferring Money Between Two Accounts
 *
 * Everyday scenario: A small banking app stores account IDs and balances in a relational table named `accounts`. When a person transfers money between accounts, either both balances must change or neither may change.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T62_jdbc/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T62Exercise {
    private P07T62Exercise() {}

    public static void transfer(Connection connection, int fromId, int toId, int amount)
            throws SQLException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
