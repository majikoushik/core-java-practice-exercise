# P04T30 · Lists: Student Workshop Waiting List

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T30`  
**Starter class:** `edu.practice.corejava.phase04.t30_lists.P04T30Exercise`  
**Validation class:** `P04T30Test`

**Primary topic:** Lists  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A weekend coding workshop is full. Registrations are saved in order in a waiting list, and a student may accidentally register more than once. When the student cancels one registration, only the first matching place should be removed.

## 2. Requirements — what the program must do

1. Remove the **first occurrence** of the requested student ID.
2. Return a new list with the relative order of everyone else unchanged.
3. Do not modify the original list.
4. If the student is absent, return a new list with the same contents.

## 3. Student task — what to submit

Complete `removeFirstFromWaitlist(List<String> waiting, String studentId)`. Handle duplicate IDs deliberately so a second registration, if present, remains in the list.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

From `[A, B, A, C]`, cancelling `A` produces `[B, A, C]` while the original list stays unchanged.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Ordered collections are essential for queues, ranked items, and user-managed lists.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T30Test -Dexercise.run=P04T30 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T30`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
