# P01T02 · Java Setup: Classroom Laptop Readiness

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T02`  
**Starter class:** `edu.practice.corejava.phase01.t02_development_environment.P01T02Exercise`  
**Validation class:** `P01T02Test`

**Primary topic:** Java Setup  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

Before a Java workshop begins, the course coordinator checks whether each classroom laptop can compile Java and whether an IDE has been configured. A laptop is usable only when both checks succeed.

## 2. Requirements — what the program must do

1. Accept two Boolean inputs: whether the JDK compiler is available and whether the IDE is configured.
2. Return `READY` only when **both** inputs are true.
3. Return `SETUP_REQUIRED` for every other combination. Return a string rather than printing.

## 3. Student task — what to submit

Complete `workstationStatus(boolean jdkCompilerAvailable, boolean ideConfigured)`. Keep the method independent of the actual computer: it evaluates the two values supplied by the caller.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`workstationStatus(true, false)` must return `SETUP_REQUIRED`; `(true, true)` must return `READY`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Deployment readiness checks and feature availability often combine several Boolean prerequisites.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T02Test -Dexercise.run=P01T02 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T02`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
