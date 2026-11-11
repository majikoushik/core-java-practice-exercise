# P07T62 · JDBC: Transferring Money Between Two Accounts

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T62`  
**Starter class:** `edu.practice.corejava.phase07.t62_jdbc.P07T62Exercise`  
**Validation class:** `P07T62Test`

**Primary topic:** JDBC  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A small banking app stores account IDs and balances in a relational table named `accounts`. When a person transfers money between accounts, either both balances must change or neither may change.

## 2. Requirements — what the program must do

1. The table has columns `id` (integer primary key) and `balance` (integer).
2. For a positive amount, subtract from the source and add to the destination as one atomic transfer.
3. Reject nonpositive amounts, missing accounts, and insufficient funds with `IllegalArgumentException` without changing either balance.
4. Propagate SQL failures as `SQLException`.
5. Preserve the connection’s original auto-commit setting.

## 3. Student task — what to submit

Complete `transfer(Connection connection, int fromId, int toId, int amount)`. Work with the connection supplied by the caller and the existing `accounts` table; no external database server is required for the test.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Starting balances `500` and `80`, transferring `120` produces `380` and `200`. Trying to transfer `999` afterward leaves both balances unchanged.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Database transactions protect consistency when one user action changes several records.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T62Test -Dexercise.run=P07T62 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T62`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
