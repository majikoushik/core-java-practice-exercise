package edu.practice.corejava.phase06.t47_thread_basics;

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
 * P06T47 — Threads: Running a Named Background Task
 *
 * Everyday scenario: A desktop app performs a short background task, such as refreshing a list of notifications, while the main screen remains responsive. The support team also wants each worker thread to have an identifiable name.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T47_thread-basics/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T47Exercise {
    private P06T47Exercise() {}

    public static Thread launch(String threadName, Runnable action) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
