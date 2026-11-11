package edu.practice.corejava.phase05.t46_modern_features;

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
 * P05T46 — Modern Java: Payment Success or Failure
 *
 * Everyday scenario: A payment screen receives one of two possible responses: a successful receipt with an amount, or a failure explaining that the payment could not proceed. The UI needs a compact status label for either case.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T46_modern-features/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T46Exercise {
    private P05T46Exercise() {}

    public sealed interface GatewayResponse permits Success, Failure {}
    public record Success(String transactionId, long amount) implements GatewayResponse {}
    public record Failure(int code, String message) implements GatewayResponse {}
    public static String describe(GatewayResponse response) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
