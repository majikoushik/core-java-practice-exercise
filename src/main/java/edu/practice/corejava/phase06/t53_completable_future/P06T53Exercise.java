package edu.practice.corejava.phase06.t53_completable_future;

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
 * P06T53 — CompletableFuture: Loyalty Points on a Shopping App
 *
 * Everyday scenario: A shopping app displays a short welcome message that combines a customer name from one service and reward points from another. The two services reply asynchronously and may finish in either order.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T53_completable-future/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T53Exercise {
    private P06T53Exercise() {}

    public static CompletableFuture<String> combineCustomerPoints(
            CompletableFuture<String> customerName, CompletableFuture<Integer> points) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
