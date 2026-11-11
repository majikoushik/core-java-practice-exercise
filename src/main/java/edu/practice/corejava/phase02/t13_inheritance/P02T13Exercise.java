package edu.practice.corejava.phase02.t13_inheritance;

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
 * P02T13 — Inheritance: Standard and Express Parcel Delivery
 *
 * Everyday scenario: A parcel-delivery shop offers regular delivery and express delivery. Both services charge based on parcel weight, but express delivery has an additional fixed surcharge.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T13_inheritance/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T13Exercise {
    private P02T13Exercise() {}

    public static class StandardShipment {
        protected final int weightKg;
        public StandardShipment(int weightKg) { this.weightKg = weightKg; }
        public int fee() { throw new UnsupportedOperationException("Not implemented"); }
    }
    public static class ExpressShipment extends StandardShipment {
        public ExpressShipment(int weightKg) { super(weightKg); }
        @Override public int fee() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
