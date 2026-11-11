package edu.practice.corejava.phase07.t57_serialization;

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
 * P07T57 — Serialization: Saving a Game Session
 *
 * Everyday scenario: A simple offline quiz game wants to save its own session identifier and number of attempts before the player closes the program. On restart, the app restores those values from bytes it created itself.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T57_serialization/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T57Exercise {
    private P07T57Exercise() {}

    public record SessionSnapshot(String id, int attempts) implements Serializable {
        private static final long serialVersionUID = 1L;
    }
    public static byte[] encode(SessionSnapshot snapshot) throws IOException {
        throw new UnsupportedOperationException("Not implemented");
    }
    public static SessionSnapshot decode(byte[] bytes) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
