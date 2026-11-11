package edu.practice.corejava.phase02.t19_nested_classes;

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
 * P02T19 — Nested Classes: Conference Attendance Badges
 *
 * Everyday scenario: A college organizes a technology conference. Every participant has a conference pass, and each attended talk is attached to that particular participant. Separately, badges can be printed before a person is assigned to a pass.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T19_nested-classes/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T19Exercise {
    private P02T19Exercise() {}

    public static class Badge {
        private final String code;
        public Badge(String code) { this.code = code; }
        public String label() { throw new UnsupportedOperationException("Not implemented"); }
    }
    public static class ConferencePass {
        private final String holder;
        public ConferencePass(String holder) { this.holder = holder; }
        public class AttendanceEntry {
            private final String session;
            public AttendanceEntry(String session) { this.session = session; }
            public String summary() { throw new UnsupportedOperationException("Not implemented"); }
        }
    }
}
