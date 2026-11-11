package edu.practice.corejava.phase07.t64_junit_and_debugging;

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
 * P07T64 — JUnit: Testing Refund Amounts
 *
 * Everyday scenario: A ticket-booking platform refunds customers after subtracting a service fee and a cancellation penalty. It must not pay a negative refund when the deductions are larger than the original payment.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T64_junit-and-debugging/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T64Exercise {
    private P07T64Exercise() {}

    public static int refundAmount(int paidAmount, int serviceFee, int penalty) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
