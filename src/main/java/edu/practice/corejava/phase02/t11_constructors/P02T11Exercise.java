package edu.practice.corejava.phase02.t11_constructors;

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
 * P02T11 — Constructors: Event Promotion Campaign
 *
 * Everyday scenario: An event organizer creates small promotional campaigns. Sometimes they start a blank draft; at other times the organizer already knows the event name and available spending budget.
 *
 * Student assignment: implement the required public behavior described in
 * exercises/phase02/P02T11_constructors/README.md.
 * Keep the public API unchanged. No solution is provided here.
 */
public final class P02T11Exercise {
    private P02T11Exercise() {}

    public static class Campaign {
        private String campaignName;
        private int campaignBudget;
        public Campaign() { throw new UnsupportedOperationException("Not implemented"); }
        public Campaign(String name, int budget) { throw new UnsupportedOperationException("Not implemented"); }
        public String name() { throw new UnsupportedOperationException("Not implemented"); }
        public int budget() { throw new UnsupportedOperationException("Not implemented"); }
    }
}
