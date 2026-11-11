# P06T51 · Executors: Processing Quiz Scores

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T51`  
**Starter class:** `edu.practice.corejava.phase06.t51_executors.P06T51Exercise`  
**Validation class:** `P06T51Test`

**Primary topic:** Executors  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A learning website needs to process many quiz scores. It assigns simple score transformations to a fixed number of workers but must present the results in the same order as the student submissions.

## 2. Requirements — what the program must do

1. For each input integer, return double its value.
2. Use an executor with the specified positive worker count.
3. Preserve input ordering in the returned list, even if tasks finish in another order.
4. Shut down worker resources after processing.
5. An empty input produces an empty list.

## 3. Student task — what to submit

Complete `doubleWithWorkers(List<Integer> values, int workers)`. This is a practice exercise for task submission and result collection. The caller needs only the ordered results, not the executor.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Inputs `[4, 1, 6]` with 2 workers produce `[8, 2, 12]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Executor-based processing lets applications control concurrency and resource usage.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T51Test -Dexercise.run=P06T51 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T51`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
