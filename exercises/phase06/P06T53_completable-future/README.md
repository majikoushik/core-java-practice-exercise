# P06T53 · CompletableFuture: Loyalty Points on a Shopping App

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T53`  
**Starter class:** `edu.practice.corejava.phase06.t53_completable_future.P06T53Exercise`  
**Validation class:** `P06T53Test`

**Primary topic:** CompletableFuture  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shopping app displays a short welcome message that combines a customer name from one service and reward points from another. The two services reply asynchronously and may finish in either order.

## 2. Requirements — what the program must do

1. Accept two already-created futures: one for a name and one for an integer points balance.
2. Return a combined future producing `<name>:<points>` when both results arrive.
3. Do not block the caller while waiting for either future.
4. If either input future fails, the combined future must complete exceptionally.

## 3. Student task — what to submit

Complete `combineCustomerPoints(...)`. The function must return immediately with a future that represents the eventual display text. The caller manages the original data sources.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

When name `Ava` and points `140` become available, the combined result is `Ava:140`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Asynchronous composition lets web apps combine independent remote-service results.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T53Test -Dexercise.run=P06T53 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T53`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
