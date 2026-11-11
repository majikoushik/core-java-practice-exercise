# P01T08 · Arrays: Cinema Seats by Row

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T08`  
**Starter class:** `edu.practice.corejava.phase01.t08_arrays.P01T08Exercise`  
**Validation class:** `P01T08Test`

**Primary topic:** Arrays  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A small cinema displays a seat map as a rectangular two-dimensional array. The value `0` means a seat can still be booked, while `1` means it has already been reserved.

## 2. Requirements — what the program must do

1. For each cinema row, count how many positions contain `0`.
2. Return the counts in the same order as the rows.
3. A row in which all seats are booked has count zero.
4. An empty seating chart produces an empty result array.

## 3. Student task — what to submit

Complete `availableSeatsPerRow(int[][] seatingChart)`. The returned integer array must contain one count per row. Treat the supplied chart as booking information and do not change it.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

For rows `[[0,1,0],[1,1,1],[0,0,0]]`, return `[2,0,3]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Reservation screens, seating charts, game boards, and tabular data frequently use arrays.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T08Test -Dexercise.run=P01T08 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T08`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
