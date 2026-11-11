# P07T55 · Java I/O: Adding Expenses from a Text File

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T55`  
**Starter class:** `edu.practice.corejava.phase07.t55_java_io.P07T55Exercise`  
**Validation class:** `P07T55Test`

**Primary topic:** Java I/O  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A student saves daily expense amounts in a simple UTF-8 text export. Each nonblank line contains one whole-number expense. A budgeting app needs to calculate the total without requiring a spreadsheet program.

## 2. Requirements — what the program must do

1. Read the supplied `InputStream` using UTF-8.
2. Each nonblank line contains one nonnegative whole-number amount.
3. Ignore blank lines and spaces surrounding valid amounts.
4. Sum all valid line amounts as `long`.
5. Throw `IllegalArgumentException` when a nonblank line is not a valid number.
6. Do not close a stream that belongs to the caller.

## 3. Student task — what to submit

Complete `sumInvoiceLines(InputStream source)`; the method name is part of the starter API even though this scenario is a personal-expense export. The input stream may be backed by a file or memory.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Lines `100`, blank, `250`, and ` 30 ` give `380`; a line containing `oops` is invalid.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Stream processing is used for imports, reports, invoices, and everyday file handling.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T55Test -Dexercise.run=P07T55 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T55`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
