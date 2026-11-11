package edu.practice.corejava.phase05.t45_optional;

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
 * P05T45 — Optional: Sending Verified Email Receipts
 *
 * Everyday scenario: An online bookstore emails receipts only when a customer has verified an email address. Some accounts have no address or contain whitespace from an incomplete signup process.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T45_optional/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T45Exercise {
    private P05T45Exercise() {}

    public record Customer(String email, boolean verified) {}
    public static Optional<String> verifiedEmail(Customer customer) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
