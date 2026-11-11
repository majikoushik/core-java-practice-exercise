package edu.practice.corejava.phase04.t33_maps;

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
 * P04T33 — Maps: Updating a Grocery Store Stock List
 *
 * Everyday scenario: A neighborhood grocery shop records available quantities by item code. In the morning, a delivery arrives with additional quantities. The shop wants an updated stock report without changing yesterday’s records.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase04/P04T33_maps/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P04T33Exercise {
    private P04T33Exercise() {}

    public static Map<String, Integer> receiveStock(Map<String, Integer> current,
                                                         Map<String, Integer> delivery) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
