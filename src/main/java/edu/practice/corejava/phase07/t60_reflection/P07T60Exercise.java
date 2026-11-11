package edu.practice.corejava.phase07.t60_reflection;

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
 * P07T60 — Reflection: Reading App Configuration Fields
 *
 * Everyday scenario: A desktop application has configuration fields such as server address, region, and display theme. An admin page should list only fields that developers explicitly marked as configurable.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T60_reflection/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T60Exercise {
    private P07T60Exercise() {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface ConfigValue {}
    public static List<String> configuredFields(Class<?> type) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
