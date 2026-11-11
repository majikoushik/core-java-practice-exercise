package edu.practice.corejava.phase07.t58_jvm_architecture;

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
 * P07T58 — JVM Internals: Identifying Who Loaded a Class
 *
 * Everyday scenario: A Java application has a diagnostics page that lists whether classes came from the core Java runtime or the application’s own code. This can help engineers understand which runtime component is being inspected.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T58_jvm-architecture/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T58Exercise {
    private P07T58Exercise() {}

    public static String loaderLabel(Class<?> javaType) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
