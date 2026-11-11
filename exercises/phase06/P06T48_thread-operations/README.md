# P06T48 · Thread Operations: Waiting for a Report

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T48`  
**Starter class:** `edu.practice.corejava.phase06.t48_thread_operations.P06T48Exercise`  
**Validation class:** `P06T48Test`

**Primary topic:** Thread Operations  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A desktop report generator starts a worker and allows the user to wait for it, but only for a limited period. If the report is still running when the limit is reached, the app should remain responsive.

## 2. Requirements — what the program must do

1. The supplied worker thread has already been started by the caller.
2. Wait up to the requested nonnegative timeout in milliseconds.
3. Return true if the thread has finished, or false if it is still alive.
4. Propagate `InterruptedException` to the caller; do not ignore interruption.

## 3. Student task — what to submit

Complete `awaitCompletion(Thread worker, long timeoutMillis)`. Your method makes a completion decision for a worker that may be fast or slow; it must not start a second worker.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A worker that finishes quickly returns true; a blocked worker with a short timeout returns false.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Timeout-aware waiting is vital when processing downloads, reports, or remote requests.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T48Test -Dexercise.run=P06T48 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T48`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
