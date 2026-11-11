# P06T54 · Virtual Threads: Checking Multiple Booking Confirmations

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T54`  
**Starter class:** `edu.practice.corejava.phase06.t54_virtual_threads.P06T54Exercise`  
**Validation class:** `P06T54Test`

**Primary topic:** Virtual Threads  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A travel website must contact several independent booking partners. Each partner check can spend time waiting, so the application wants to run them concurrently and still report results in the order requested.

## 2. Requirements — what the program must do

1. Execute each supplied `Callable<String>` on a Java virtual thread.
2. Collect results in the same order as the original list.
3. Do not return until every successful check has completed.
4. If a check fails, propagate the failure as `ExecutionException`.
5. Do not leave tasks running after the method returns.

## 3. Student task — what to submit

Complete `runChecks(List<Callable<String>> checks)`. The callers supply the checks; your method is responsible for running and collecting them. The tests also inspect whether these checks used virtual threads.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Checks for `hotel` and `flight` should return their results in request order, even if flight finishes first.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Virtual threads support applications with many independent operations that spend time waiting.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T54Test -Dexercise.run=P06T54 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T54`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
