# P05T43 · Stream Terminal Operations: Store Payment Summary

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T43`  
**Starter class:** `edu.practice.corejava.phase05.t43_terminal_operations.P05T43Exercise`  
**Validation class:** `P05T43Test`

**Primary topic:** Stream Terminal Operations  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shop owner looks at a dashboard of payment records. Completed payments should contribute to revenue, while disputed payments should trigger a warning that some transaction needs attention.

## 2. Requirements — what the program must do

1. `capturedRevenue` sums the amounts of records with status exactly `CAPTURED`.
2. Other statuses do not contribute to the total.
3. `hasDispute` returns true if at least one record has status exactly `DISPUTED`.
4. For an empty payment list, revenue is zero and dispute status is false.

## 3. Student task — what to submit

Complete the two summary methods using the supplied `Payment` records. They should answer separate questions about the same list; no external payment gateway is involved.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Payments of `120 CAPTURED`, `80 CAPTURED`, and `50 PENDING` produce revenue `200`. Any `DISPUTED` record makes the warning true.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Dashboards constantly aggregate values and check whether any record matches a condition.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T43Test -Dexercise.run=P05T43 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T43`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
