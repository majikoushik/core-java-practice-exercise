package edu.practice.corejava.phase02.t12_encapsulation;

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
 * P02T12 — Encapsulation: Prepaid Canteen Wallet
 *
 * Everyday scenario: Students can load money into a prepaid wallet and use it at a campus canteen. The wallet must protect its balance from invalid operations and from spending more money than the student has.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T12_encapsulation/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T12Exercise {
    private P02T12Exercise() {}

    public static class Wallet {
        private int balance;
        public void deposit(int amount) { throw new UnsupportedOperationException("Not implemented"); }
        public void spend(int amount) { throw new UnsupportedOperationException("Not implemented"); }
        public int balance() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
