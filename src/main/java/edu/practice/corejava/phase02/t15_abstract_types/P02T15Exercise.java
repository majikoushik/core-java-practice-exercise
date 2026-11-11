package edu.practice.corejava.phase02.t15_abstract_types;

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
 * P02T15 — Abstraction: Email and SMS Notifications
 *
 * Everyday scenario: A movie-ticket booking website sends booking updates through email or text message. Its booking service should work with either channel without needing to know the details of that channel.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T15_abstract-types/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T15Exercise {
    private P02T15Exercise() {}

    public interface NotificationChannel { String deliver(String recipient, String message); }
    public static class EmailChannel implements NotificationChannel {
        @Override public String deliver(String recipient, String message) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }
    public static class SmsChannel implements NotificationChannel {
        @Override public String deliver(String recipient, String message) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }
    public static abstract class BaseAlert {
            public abstract String format(String message);
        }
        public static class SystemAlert extends BaseAlert {
            @Override public String format(String message) {
                throw new UnsupportedOperationException("Not implemented");
            }
        }
}
