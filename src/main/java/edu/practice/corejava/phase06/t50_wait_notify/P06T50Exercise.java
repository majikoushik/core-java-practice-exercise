package edu.practice.corejava.phase06.t50_wait_notify;

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
 * P06T50 — Wait/Notify: Opening a Concert Venue Gate
 *
 * Everyday scenario: Several visitors are waiting outside a concert gate. The entrance controller opens the gate once, at which point everyone waiting can enter; late arrivals should be allowed through without waiting again.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase06/P06T50_wait-notify/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P06T50Exercise {
    private P06T50Exercise() {}

    public static class Gate {
        private boolean open;
        public void awaitOpen() throws InterruptedException {
            throw new UnsupportedOperationException("Not implemented");
        }
        public void open() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }
}
