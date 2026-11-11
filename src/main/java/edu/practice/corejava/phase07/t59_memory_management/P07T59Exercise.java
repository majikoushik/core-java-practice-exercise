package edu.practice.corejava.phase07.t59_memory_management;

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
 * P07T59 — Memory Management: Clearing an Image Preview
 *
 * Everyday scenario: A photo-viewing app temporarily keeps image bytes while the user previews a picture. Once the preview is closed, the application should no longer retain a reference to the large byte array.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase07/P07T59_memory-management/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P07T59Exercise {
    private P07T59Exercise() {}

    public static class PayloadHolder {
        private byte[] payload;
        public PayloadHolder(byte[] payload) { this.payload = payload; }
        public int currentSize() { throw new UnsupportedOperationException("Not implemented"); }
        public void release() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
