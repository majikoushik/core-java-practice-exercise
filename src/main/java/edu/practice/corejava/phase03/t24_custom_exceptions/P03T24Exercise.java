package edu.practice.corejava.phase03.t24_custom_exceptions;

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
 * P03T24 — Custom Exceptions: Reserving Event Seats
 *
 * Everyday scenario: A college event has a limited number of seats. Students reserve groups of seats, and the booking interface needs a special error when the request is larger than the remaining capacity.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase03/P03T24_custom-exceptions/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P03T24Exercise {
    private P03T24Exercise() {}

    public static class QuotaExceededException extends RuntimeException {
        private final int requested;
        private final int available;
        public QuotaExceededException(int requested, int available) {
            super("Quota exceeded"); this.requested = requested; this.available = available;
        }
        public int requested() { return requested; }
        public int available() { return available; }
    }
    public static int reserve(int available, int requested) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
