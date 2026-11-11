# P07T64 · JUnit: Testing Refund Amounts

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T64`  
**Starter class:** `edu.practice.corejava.phase07.t64_junit_and_debugging.P07T64Exercise`  
**Validation class:** `P07T64Test`

**Primary topic:** JUnit  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A ticket-booking platform refunds customers after subtracting a service fee and a cancellation penalty. It must not pay a negative refund when the deductions are larger than the original payment.

## 2. Requirements — what the program must do

1. Return the paid amount minus the service fee and penalty.
2. If deductions exceed the paid amount, return zero rather than a negative number.
3. All supplied amounts are nonnegative.
4. In addition to satisfying the provided tests, students must write one new boundary-case JUnit test of their own.

## 3. Student task — what to submit

Complete `refundAmount(int paidAmount, int serviceFee, int penalty)`. Then add a JUnit test covering a meaningful boundary value (for example, the exact limit where the refund reaches zero); keep your own test separate from production code.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Payment `1000` with fee `200` and penalty `100` refunds `700`; payment `100` with deductions of `140` refunds `0`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Automated regression tests protect everyday calculations when code is changed later.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T64Test -Dexercise.run=P07T64 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T64`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
