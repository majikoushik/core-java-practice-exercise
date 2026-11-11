package edu.practice.corejava.phase03.t28_enums;

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
 * P03T28 — Enums: Tracking Online Shopping Orders
 *
 * Everyday scenario: A shopping app tracks an order from creation through payment, packing, and shipping. Staff should not be able to skip mandatory stages or move an order backwards.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase03/P03T28_enums/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P03T28Exercise {
    private P03T28Exercise() {}

    public enum OrderStage { CREATED, PAID, PACKED, SHIPPED }
    public static boolean mayTransition(OrderStage from, OrderStage to) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
