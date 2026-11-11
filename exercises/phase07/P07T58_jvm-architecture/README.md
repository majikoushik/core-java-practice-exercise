# P07T58 · JVM Internals: Identifying Who Loaded a Class

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T58`  
**Starter class:** `edu.practice.corejava.phase07.t58_jvm_architecture.P07T58Exercise`  
**Validation class:** `P07T58Test`

**Primary topic:** JVM Internals  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A Java application has a diagnostics page that lists whether classes came from the core Java runtime or the application’s own code. This can help engineers understand which runtime component is being inspected.

## 2. Requirements — what the program must do

1. For a class whose class loader is null, return the exact text `bootstrap`.
2. For other classes, return the simple name of their class loader’s Java class.
3. The supplied `Class<?>` is nonnull.
4. Do not hard-code a particular application class loader name.

## 3. Student task — what to submit

Complete `loaderLabel(Class<?> javaType)`. The test checks a core Java class and a class from this project. Return information about the class actually provided.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`String.class` returns `bootstrap`; an application class returns the simple name of its actual loader.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Class loading explains how the JVM locates application code and core platform classes.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T58Test -Dexercise.run=P07T58 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T58`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
