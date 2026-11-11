# P07T63 · Java Modules: Sharing a Library API

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T63`  
**Starter class:** `edu.practice.corejava.phase07.t63_java_modules.P07T63Exercise`  
**Validation class:** `P07T63Test`

**Primary topic:** Java Modules  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A team develops a reusable library module for a school application. They want other modules to access the library’s public API package while keeping the module definition explicit.

## 2. Requirements — what the program must do

1. Build a `ModuleDescriptor` for the supplied valid module name.
2. Export exactly the supplied valid API package.
3. The returned descriptor must report the requested module name and export.
4. Do not add unrelated exports or additional requires entries.

## 3. Student task — what to submit

Complete `describeModule(String moduleName, String exportedPackage)`. The method returns a Java module description; a separate multi-module project or real JAR packaging is not required for this focused exercise.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Module `org.demo.books` exporting `org.demo.books.api` reports exactly that single export.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Modules help larger Java systems define explicit boundaries between APIs and internal implementation.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T63Test -Dexercise.run=P07T63 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T63`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
