package edu.practice.corejava.phase03.t22_wrappers;

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
 * P03T22 — Wrapper Classes: Missing Numbers in a Survey
 *
 * Everyday scenario: An online school survey exports optional numeric responses into a CSV-like table. Some cells are blank because students skipped the question. A blank response must not be confused with the number zero.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase03/P03T22_wrappers/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P03T22Exercise {
    private P03T22Exercise() {}

    public static Integer parseOptionalCount(String cellValue) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
