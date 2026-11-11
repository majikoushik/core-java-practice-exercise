package edu.practice.corejava.phase04.t36_generics;

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
 * P04T36 — Generics: Reusable Last-Item and Score Summaries
 *
 * Everyday scenario: A dashboard can display lists of book titles, student names, or recent orders. It needs a reusable way to obtain the last displayed item. A separate chart totals scores that may be stored as integers or decimals.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase04/P04T36_generics/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P04T36Exercise {
    private P04T36Exercise() {}

    public static <T> T lastOrDefault(List<T> values, T fallback) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public static double sumMetrics(List<? extends Number> values) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
