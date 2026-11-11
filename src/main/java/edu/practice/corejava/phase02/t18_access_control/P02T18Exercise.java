package edu.practice.corejava.phase02.t18_access_control;

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
 * P02T18 — Access Modifiers: Protecting Customer Information
 *
 * Everyday scenario: A small banking app holds a customer name, account tier, branch identifier, and a secret PIN. Some of these details may be visible outside the class, while the PIN must not be directly exposed.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T18_access-control/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T18Exercise {
    private P02T18Exercise() {}

    public static class CustomerRecord {
        public String secretPin;
        public int accountTier;
        public String branchCode;
        public String publicName;
    }
}
