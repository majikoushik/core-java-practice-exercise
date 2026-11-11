package edu.practice.corejava.phase05.t42_streams;

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
 * P05T42 — Streams: Exporting a Shopping Product Catalog
 *
 * Everyday scenario: An online store shares an active-products list with another service. Some catalog entries are disabled, and a product code may appear more than once. The exported list must contain clean, unique codes.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase05/P05T42_streams/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P05T42Exercise {
    private P05T42Exercise() {}

    public record CatalogEntry(String sku, boolean active) {}
    public static List<String> activeSkuExport(List<CatalogEntry> catalog) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
