package edu.practice.corejava.phase07.t61_annotations;

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
 * P07T61 — Annotations: Tracking Admin Actions
 *
 * Everyday scenario: An online shop records sensitive administrator operations such as charging a payment and issuing a refund. Developers label the relevant service methods so an audit tool can discover which actions require special logging.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T61_annotations/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T61Exercise {
    private P07T61Exercise() {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Audited { String action(); }
    public static List<String> auditActions(Class<?> serviceType) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
