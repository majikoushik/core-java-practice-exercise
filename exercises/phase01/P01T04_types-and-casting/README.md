# P01T04 · Data Types: Cloud Photo Backup Storage

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T04`  
**Starter class:** `edu.practice.corejava.phase01.t04_types_and_casting.P01T04Exercise`  
**Validation class:** `P01T04Test`

**Primary topic:** Data Types  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A phone-photo backup website displays storage allowances in mebibytes (MiB), but its billing service stores allowances as whole bytes. Some customers have plans much larger than the range of a 32-bit integer.

## 2. Requirements — what the program must do

1. Convert the supplied nonnegative MiB quantity to bytes.
2. Use `1 MiB = 1,048,576 bytes`.
3. Discard any fractional byte and return the result as a `long`, including for large storage plans.

## 3. Student task — what to submit

Complete `quotaInBytes(double quotaMiB)`. Provide the integer byte allowance for the plan sent by the website. The method should return a value and must not print a formatted storage label.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`quotaInBytes(1.5)` returns `1572864`; `quotaInBytes(5120.0)` returns `5368709120`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Storage, file transfer, and memory APIs routinely translate between decimal numbers and integer byte counts.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T04Test -Dexercise.run=P01T04 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T04`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
