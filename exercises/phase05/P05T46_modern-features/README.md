# P05T46 · Modern Java: Payment Success or Failure

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T46`  
**Starter class:** `edu.practice.corejava.phase05.t46_modern_features.P05T46Exercise`  
**Validation class:** `P05T46Test`

**Primary topic:** Modern Java  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A payment screen receives one of two possible responses: a successful receipt with an amount, or a failure explaining that the payment could not proceed. The UI needs a compact status label for either case.

## 2. Requirements — what the program must do

1. Keep the provided sealed response family and record types unchanged.
2. For `Success`, return `OK:<transactionId>:<amount>`.
3. For `Failure`, return `ERROR:<code>`.
4. Every supported response subtype must produce its corresponding result.

## 3. Student task — what to submit

Complete `describe(GatewayResponse response)` using the already-declared response model. This exercise focuses on how modern Java represents fixed alternatives and immutable data.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`Success("T100", 500)` becomes `OK:T100:500`; `Failure(403, "Forbidden")` becomes `ERROR:403`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Sealed types and records help represent well-defined API responses safely.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T46Test -Dexercise.run=P05T46 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T46`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
