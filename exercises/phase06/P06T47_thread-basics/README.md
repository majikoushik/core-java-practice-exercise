# P06T47 · Threads: Running a Named Background Task

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T47`  
**Starter class:** `edu.practice.corejava.phase06.t47_thread_basics.P06T47Exercise`  
**Validation class:** `P06T47Test`

**Primary topic:** Threads  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A desktop app performs a short background task, such as refreshing a list of notifications, while the main screen remains responsive. The support team also wants each worker thread to have an identifiable name.

## 2. Requirements — what the program must do

1. Create a thread with the provided name.
2. Run the supplied `Runnable` on that new thread rather than on the caller thread.
3. Start the thread before returning it.
4. Return the actual thread object so the caller can inspect or join it.

## 3. Student task — what to submit

Complete `launch(String threadName, Runnable action)`. The action is supplied by the caller and may record which thread executed it. The method must launch the action and return the worker.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A task launched with thread name `refresh-worker` must run under that name; the returned thread can be joined by the caller.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Background tasks are used for refreshing data, logging, and keeping user interfaces responsive.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T47Test -Dexercise.run=P06T47 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T47`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
