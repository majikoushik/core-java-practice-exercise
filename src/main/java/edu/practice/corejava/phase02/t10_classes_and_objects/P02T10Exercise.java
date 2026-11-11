package edu.practice.corejava.phase02.t10_classes_and_objects;

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
 * P02T10 — Classes and Objects: Sports Club Equipment Loans
 *
 * Everyday scenario: A college sports club lends badminton rackets and footballs to students. Each physical item has a code and can be borrowed by only one student at a time. Two rackets must maintain their availability independently.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T10_classes-and-objects/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T10Exercise {
    private P02T10Exercise() {}

    public static class Equipment {
        private final String identifier;
        public Equipment(String identifier) { this.identifier = identifier; }
        public String code() { throw new UnsupportedOperationException("Not implemented"); }
        public boolean isAvailable() { throw new UnsupportedOperationException("Not implemented"); }
        public boolean checkout() { throw new UnsupportedOperationException("Not implemented"); }
        public void returnItem() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
