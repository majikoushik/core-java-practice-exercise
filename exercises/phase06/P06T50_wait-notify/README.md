# P06T50 · Wait/Notify: Opening a Concert Venue Gate

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T50`  
**Starter class:** `edu.practice.corejava.phase06.t50_wait_notify.P06T50Exercise`  
**Validation class:** `P06T50Test`

**Primary topic:** Wait/Notify  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

Several visitors are waiting outside a concert gate. The entrance controller opens the gate once, at which point everyone waiting can enter; late arrivals should be allowed through without waiting again.

## 2. Requirements — what the program must do

1. `awaitOpen()` blocks while the gate is closed.
2. Calling `open()` changes the gate to the open state and permits all existing waiting threads to continue.
3. Calls to `awaitOpen()` made after opening return immediately.
4. Interruption while waiting must be propagated as `InterruptedException`.

## 3. Student task — what to submit

Complete the supplied `Gate` class with `awaitOpen()` and `open()`. The tests will use a separate worker to verify that it genuinely waits before opening.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A visitor arriving before `open()` must wait; after opening, both the waiting visitor and new visitors can proceed.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Thread coordination is needed when work must wait for another event to occur.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T50Test -Dexercise.run=P06T50 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T50`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
