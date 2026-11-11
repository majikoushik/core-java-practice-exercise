# P06T49 · Synchronization: Counting Website Visitors

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T49`  
**Starter class:** `edu.practice.corejava.phase06.t49_synchronization.P06T49Exercise`  
**Validation class:** `P06T49Test`

**Primary topic:** Synchronization  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A school event website receives many page visits at almost the same time. Every visit should increase a shared counter by one; if two visitors arrive simultaneously, neither increment may be lost.

## 2. Requirements — what the program must do

1. The counter initially reports zero.
2. `increment()` adds exactly one visit.
3. `value()` returns the number of visits counted so far.
4. Operations must remain correct when multiple threads call them concurrently.

## 3. Student task — what to submit

Complete the nested `VisitCounter` class. Its two public methods are already declared. The result must stay accurate when tests launch many worker tasks at once.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

After 1,000 successful concurrent increments, `value()` must report `1000`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Shared counters illustrate race conditions, atomicity, and synchronization in web services.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T49Test -Dexercise.run=P06T49 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T49`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
