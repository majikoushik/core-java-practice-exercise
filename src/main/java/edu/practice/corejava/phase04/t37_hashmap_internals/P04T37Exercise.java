package edu.practice.corejava.phase04.t37_hashmap_internals;

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
 * P04T37 — HashMap Internals: Identifying Products Across Stores
 *
 * Everyday scenario: The same product code can be stocked in several grocery branches. A product is uniquely identified by **both** its store code and the product code; the same product code in different stores represents separate inventory.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase04/P04T37_hashmap-internals/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P04T37Exercise {
    private P04T37Exercise() {}

    public static class StockKey {
        private final String warehouse;
        private final String sku;
        public StockKey(String warehouse, String sku) { this.warehouse = warehouse; this.sku = sku; }
        @Override public boolean equals(Object other) { throw new UnsupportedOperationException("Not implemented"); }
        @Override public int hashCode() { throw new UnsupportedOperationException("Not implemented"); }
    }
    public static int lookup(Map<StockKey, Integer> inventory, String warehouse, String sku) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
