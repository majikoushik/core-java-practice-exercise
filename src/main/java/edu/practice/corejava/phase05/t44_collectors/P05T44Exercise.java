package edu.practice.corejava.phase05.t44_collectors;

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
 * P05T44 — Collectors: Workshop Participants by City and Age
 *
 * Everyday scenario: A city-wide workshop collects applicants from different cities. Organizers need the number of applicants from each city and separate lists of adults and minors for registration handling.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T44_collectors/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T44Exercise {
    private P05T44Exercise() {}

    public record Candidate(String name, String city, int age) {}
    public static Map<String, Long> countByCity(List<Candidate> candidates) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public static Map<Boolean, List<Candidate>> partitionEligible(List<Candidate> candidates) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
