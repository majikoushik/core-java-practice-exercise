package edu.practice.corejava.phase06.t48_thread_operations;

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
 * P06T48 — Thread Operations: Waiting for a Report
 *
 * Everyday scenario: A desktop report generator starts a worker and allows the user to wait for it, but only for a limited period. If the report is still running when the limit is reached, the app should remain responsive.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T48_thread-operations/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T48Exercise {
    private P06T48Exercise() {}

    public static boolean awaitCompletion(Thread worker, long timeoutMillis) throws InterruptedException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
