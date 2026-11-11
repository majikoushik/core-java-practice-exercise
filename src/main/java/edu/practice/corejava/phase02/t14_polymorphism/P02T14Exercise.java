package edu.practice.corejava.phase02.t14_polymorphism;

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
 * P02T14 — Polymorphism: Online Shopping Discounts
 *
 * Everyday scenario: A shopping website sometimes offers a fixed-amount coupon and sometimes a percentage discount. The checkout screen should apply either offer without changing the checkout calculation workflow.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T14_polymorphism/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T14Exercise {
    private P02T14Exercise() {}

    public interface Discount { int discount(int subtotal); }
    public static class FlatDiscount implements Discount {
        private final int amount;
        public FlatDiscount(int amount) { this.amount = amount; }
        @Override public int discount(int subtotal) { throw new UnsupportedOperationException("Not implemented"); }
    }
    public static class PercentDiscount implements Discount {
        private final int percent;
        public PercentDiscount(int percent) { this.percent = percent; }
        @Override public int discount(int subtotal) { throw new UnsupportedOperationException("Not implemented"); }
    }
    public static int totalAfterDiscount(int subtotal, Discount policy) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public static int totalAfterDiscount(int subtotal) {
            throw new UnsupportedOperationException("Not implemented");
        }
}
