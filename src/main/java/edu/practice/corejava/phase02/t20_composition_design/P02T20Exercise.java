package edu.practice.corejava.phase02.t20_composition_design;

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
 * P02T20 — Composition: Shopping Checkout with Messaging
 *
 * Everyday scenario: A small online store delegates price calculation to a pricing service and sends the buyer an order message through a separate messaging service. The checkout code should continue working when either service is replaced.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T20_composition-design/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T20Exercise {
    private P02T20Exercise() {}

    public interface Pricing { int calculate(int subtotal); }
    public interface Messenger { void send(String text); }
    public static class CheckoutService {
        private final Pricing pricing;
        private final Messenger messenger;
        public CheckoutService(Pricing pricing, Messenger messenger) {
            this.pricing = pricing; this.messenger = messenger;
        }
        public int checkout(String buyer, int subtotal) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }
}
