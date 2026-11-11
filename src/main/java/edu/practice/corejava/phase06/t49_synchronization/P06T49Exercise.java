package edu.practice.corejava.phase06.t49_synchronization;

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
 * P06T49 — Synchronization: Counting Website Visitors
 *
 * Everyday scenario: A school event website receives many page visits at almost the same time. Every visit should increase a shared counter by one; if two visitors arrive simultaneously, neither increment may be lost.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T49_synchronization/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T49Exercise {
    private P06T49Exercise() {}

    public static class VisitCounter {
        private int count;
        public void increment() { throw new UnsupportedOperationException("Not implemented"); }
        public int value() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
