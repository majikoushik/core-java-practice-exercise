# P01T01 · Java Runtime: Helpdesk Diagnostic Badge

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T01`  
**Starter class:** `edu.practice.corejava.phase01.t01_java_platform.P01T01Exercise`  
**Validation class:** `P01T01Test`

**Primary topic:** Java Runtime  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A laptop-repair helpdesk receives screenshots of Java applications failing on customers’ computers. The support agent needs a short label showing exactly which Java runtime is executing the application, rather than relying on what a customer remembers installing.

## 2. Requirements — what the program must do

1. Return one line in the exact form `Java <spec-version>
2. <vm-name>`.
3. Use the values from the *currently running* Java process, not hard-coded values.
4. Preserve the spaces and vertical bar exactly; do not write to the console.

## 3. Student task — what to submit

Complete `runtimeBadge()` in the supplied class. The returned text will be compared with the properties of the machine running the tests. Your submission is the completed method, not a screenshot or a manually typed badge.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

If a runtime reports specification version `21` and VM name `OpenJDK 64-Bit Server VM`, the expected badge is `Java 21 | OpenJDK 64-Bit Server VM`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Support logs often need runtime metadata to reproduce a bug on the correct Java installation.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T01Test -Dexercise.run=P01T01 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T01`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
