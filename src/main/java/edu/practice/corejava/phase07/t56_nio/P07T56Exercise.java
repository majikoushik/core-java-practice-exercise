package edu.practice.corejava.phase07.t56_nio;

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
 * P07T56 — NIO.2: Finding CSV Files in a Downloads Folder
 *
 * Everyday scenario: A school administrator exports attendance sheets into a download folder. The import tool must find only CSV files at the top level, ignoring text notes and other folders.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T56_nio/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T56Exercise {
    private P07T56Exercise() {}

    public static List<Path> csvFilesInInbox(Path inbox) throws IOException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
