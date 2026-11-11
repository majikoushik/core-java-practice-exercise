# P01T09 · Methods: Shopping Bill and Reference Number

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T09`  
**Starter class:** `edu.practice.corejava.phase01.t09_methods.P01T09Exercise`  
**Validation class:** `P01T09Test`

**Primary topic:** Methods  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An online grocery app needs to add together any number of item prices (recorded as whole units). Separately, customer support needs a small utility that reports the digit total of a numeric complaint reference.

## 2. Requirements — what the program must do

1. `invoiceTotal` must sum any number of whole-number line amounts.
2. No line amounts means a total of zero; return a `long`.
3. `digitSum` must sum the decimal digits of a nonnegative integer.
4. For reference number zero, the digit sum is zero.

## 3. Student task — what to submit

Complete both provided methods, `invoiceTotal(int... lineAmounts)` and `digitSum(int referenceNumber)`. They are independent functions; each should return its result without reading input or printing.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`invoiceTotal(100, 250, 520)` is `870`; `digitSum(590)` is `14`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Well-defined methods support reusable calculations, utility functions, and small services.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T09Test -Dexercise.run=P01T09 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T09`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
