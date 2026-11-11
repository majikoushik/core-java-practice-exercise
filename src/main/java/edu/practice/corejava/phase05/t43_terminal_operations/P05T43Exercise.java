package edu.practice.corejava.phase05.t43_terminal_operations;

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
 * P05T43 — Stream Terminal Operations: Store Payment Summary
 *
 * Everyday scenario: A shop owner looks at a dashboard of payment records. Completed payments should contribute to revenue, while disputed payments should trigger a warning that some transaction needs attention.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T43_terminal-operations/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T43Exercise {
    private P05T43Exercise() {}

    public record Payment(int amount, String status) {}
    public static long capturedRevenue(List<Payment> payments) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public static boolean hasDispute(List<Payment> payments) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
