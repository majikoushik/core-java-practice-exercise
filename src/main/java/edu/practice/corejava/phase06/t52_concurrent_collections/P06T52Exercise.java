package edu.practice.corejava.phase06.t52_concurrent_collections;

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
 * P06T52 — Concurrent Collections: Student Council Vote Counting
 *
 * Everyday scenario: During a student-council election, thousands of vote records arrive close together. Each vote contains a candidate ID. The final tally must account for every vote, even when votes are processed concurrently.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T52_concurrent-collections/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T52Exercise {
    private P06T52Exercise() {}

    public static Map<String, Integer> tallyVotes(List<String> votes) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
