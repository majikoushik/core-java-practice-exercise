package edu.practice.corejava.phase03.t23_exceptions;

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
 * P03T23 — Exceptions: ATM Withdrawal Validation
 *
 * Everyday scenario: An ATM displays an available balance and receives a requested withdrawal amount. If the request is impossible, it must reject the transaction rather than returning an incorrect balance.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase03/P03T23_exceptions/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P03T23Exercise {
    private P03T23Exercise() {}

    public static int debit(int currentBalance, int amount) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
