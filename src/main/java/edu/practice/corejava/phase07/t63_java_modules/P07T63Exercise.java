package edu.practice.corejava.phase07.t63_java_modules;

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
 * P07T63 — Java Modules: Sharing a Library API
 *
 * Everyday scenario: A team develops a reusable library module for a school application. They want other modules to access the library’s public API package while keeping the module definition explicit.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T63_java-modules/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T63Exercise {
    private P07T63Exercise() {}

    public static ModuleDescriptor describeModule(String moduleName, String exportedPackage) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
