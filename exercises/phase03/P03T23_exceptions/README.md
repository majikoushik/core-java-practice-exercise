# P03T23 · Exceptions: ATM Withdrawal Validation

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T23`  
**Starter class:** `edu.practice.corejava.phase03.t23_exceptions.P03T23Exercise`  
**Validation class:** `P03T23Test`

**Primary topic:** Exceptions  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An ATM displays an available balance and receives a requested withdrawal amount. If the request is impossible, it must reject the transaction rather than returning an incorrect balance.

## 2. Requirements — what the program must do

1. A valid withdrawal returns `currentBalance - amount`.
2. Reject a negative existing balance.
3. Reject zero or negative withdrawal amounts.
4. Reject a withdrawal greater than the available balance.
5. All invalid inputs cause `IllegalArgumentException`.

## 3. Student task — what to submit

Complete `debit(int currentBalance, int amount)`. Work only with the two supplied values; no account database or user input is required. The caller must be able to distinguish a valid new balance from an invalid withdrawal.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

With balance `120` and withdrawal `70`, return `50`; requesting `41` from balance `40` is invalid.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Exceptions make invalid actions visible to callers instead of hiding failures.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T23Test -Dexercise.run=P03T23 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T23`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
