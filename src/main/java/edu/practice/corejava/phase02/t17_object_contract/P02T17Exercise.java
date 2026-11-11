package edu.practice.corejava.phase02.t17_object_contract;

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
 * P02T17 — Object Class: Customer Loyalty Card Identity
 *
 * Everyday scenario: A shop issues loyalty card IDs. The same card may be reconstructed from two separate files, producing two Java objects that must still be recognized as the same logical card.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T17_object-contract/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T17Exercise {
    private P02T17Exercise() {}

    public static final class CustomerKey {
        private final String tenant;
        private final String customerId;
        public CustomerKey(String tenant, String customerId) {
            this.tenant = tenant; this.customerId = customerId;
        }
        @Override public boolean equals(Object other) { throw new UnsupportedOperationException("Not implemented"); }
        @Override public int hashCode() { throw new UnsupportedOperationException("Not implemented"); }
        @Override public String toString() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
