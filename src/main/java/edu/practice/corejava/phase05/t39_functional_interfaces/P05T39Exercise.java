package edu.practice.corejava.phase05.t39_functional_interfaces;

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
 * P05T39 — Functional Interfaces: Scholarship Shortlisting
 *
 * Everyday scenario: A college runs several student-support programs. One program accepts students scoring at least 70, while another uses a different rule. The shortlist service should accept the rule as an input rather than be rewritten for every program.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T39_functional-interfaces/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T39Exercise {
    private P05T39Exercise() {}

    public record Applicant(String name, int testScore) {}
    @FunctionalInterface public interface EligibilityRule { boolean allows(Applicant applicant); }
    public static List<Applicant> eligibleApplicants(List<Applicant> applicants, EligibilityRule rule) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
