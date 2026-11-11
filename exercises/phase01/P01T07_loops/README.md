# P01T07 · Loops: On-Time Delivery Streak

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T07`  
**Starter class:** `edu.practice.corejava.phase01.t07_loops.P01T07Exercise`  
**Validation class:** `P01T07Test`

**Primary topic:** Loops  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A food-delivery app shows how many consecutive days a delivery partner was on time starting from the beginning of a weekly report. A negative delay means early delivery, zero means exactly on time, and a positive value means late.

## 2. Requirements — what the program must do

1. Read the daily delays in the order provided.
2. Count the consecutive opening days having delay less than or equal to zero.
3. Stop counting at the **first** positive delay; later successful days do not restart this streak.
4. For an empty report, return zero.

## 3. Student task — what to submit

Complete `openingOnTimeStreak(int[] dailyDelayMinutes)`. Return only the count. Students should be able to explain why a late day in the middle prevents later days from adding to the initial streak.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

The delays `[0, -2, 0, 9, 0]` give a starting on-time streak of `3`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Many reporting features process data sequentially until a stopping condition is reached.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T07Test -Dexercise.run=P01T07 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T07`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
