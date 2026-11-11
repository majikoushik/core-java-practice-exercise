package edu.practice.corejava.phase06.t51_executors;

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
 * P06T51 — Executors: Processing Quiz Scores
 *
 * Everyday scenario: A learning website needs to process many quiz scores. It assigns simple score transformations to a fixed number of workers but must present the results in the same order as the student submissions.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T51_executors/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T51Exercise {
    private P06T51Exercise() {}

    public static List<Integer> doubleWithWorkers(List<Integer> values, int workers)
            throws InterruptedException, ExecutionException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
