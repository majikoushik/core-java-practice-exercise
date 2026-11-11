package edu.practice.corejava.phase03.t26_date_time;

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
 * P03T26 — Date and Time: Online Order Delivery Planning
 *
 * Everyday scenario: An online shop promises to dispatch orders after a specified number of working days, but its dispatch team does not work on weekends. A second screen shows order updates in the customer’s own time zone.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase03/P03T26_date-time/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P03T26Exercise {
    private P03T26Exercise() {}

    public static LocalDate dispatchDate(LocalDate orderDate, int leadBusinessDays) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public static ZonedDateTime localizeInstant(Instant timestamp, ZoneId zone) {
            throw new UnsupportedOperationException("Not implemented");
        }
}
