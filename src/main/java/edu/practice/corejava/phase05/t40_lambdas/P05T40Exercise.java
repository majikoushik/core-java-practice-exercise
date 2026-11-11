package edu.practice.corejava.phase05.t40_lambdas;

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
 * P05T40 — Lambda Expressions: Minimum Order Filter
 *
 * Everyday scenario: A shopping app offers users a filter called “Orders above ₹500.” The value can change, so the app needs a reusable condition representing the selected minimum total.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T40_lambdas/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T40Exercise {
    private P05T40Exercise() {}

    public record Purchase(String id, int total) {}
    public static Predicate<Purchase> minimumPurchaseRule(int threshold) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
