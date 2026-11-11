package edu.practice.corejava.phase04.t35_sorting;

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
 * P04T35 — Sorting: Employee Directory and Experience
 *
 * Everyday scenario: A company displays employee records in two ways: a seniority view showing more experienced employees first, and a team directory grouped by team name. The records should be reusable between the two views.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase04/P04T35_sorting/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P04T35Exercise {
    private P04T35Exercise() {}

    public record Employee(String name, String team, int yearsExperience) implements Comparable<Employee> {
        @Override public int compareTo(Employee other) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }
    public static List<Employee> teamDirectory(List<Employee> employees) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
