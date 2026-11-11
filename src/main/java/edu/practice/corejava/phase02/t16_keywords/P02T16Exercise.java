package edu.practice.corejava.phase02.t16_keywords;

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
 * P02T16 — Keywords: Standard and VIP Event Passes
 *
 * Everyday scenario: At a concert entrance, staff scan standard passes and VIP passes. The scanner must label a recognized pass correctly and report unknown items without crashing.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T16_keywords/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T16Exercise {
    private P02T16Exercise() {}

    public static final String FACILITY = "CENTRAL";
    public static class StandardPass {
        protected final String identifier;
        public StandardPass(String identifier) { this.identifier = identifier; }
        public String id() { throw new UnsupportedOperationException("Not implemented"); }
    }
    public static final class VipPass extends StandardPass {
        public VipPass(String identifier) { super(identifier); }
    }
    public static String passTier(Object pass) { throw new UnsupportedOperationException("Not implemented"); }
}
