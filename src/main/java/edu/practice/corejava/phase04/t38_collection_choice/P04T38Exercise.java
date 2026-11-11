package edu.practice.corejava.phase04.t38_collection_choice;

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
 * P04T38 — Choosing Collections: Website User Roles
 *
 * Everyday scenario: A website administrator assigns permissions to roles such as `reader`, `editor`, and `admin`. The import file may repeat the same permission several times. The screen must show roles in arrival order and each permission only once.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase04/P04T38_collection-choice/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P04T38Exercise {
    private P04T38Exercise() {}

    public record Grant(String role, String permission) {}
    public static Map<String, Set<String>> permissionsByRole(List<Grant> grants) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
