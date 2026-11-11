# P04T36 · Generics: Reusable Last-Item and Score Summaries

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T36`  
**Starter class:** `edu.practice.corejava.phase04.t36_generics.P04T36Exercise`  
**Validation class:** `P04T36Test`

**Primary topic:** Generics  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A dashboard can display lists of book titles, student names, or recent orders. It needs a reusable way to obtain the last displayed item. A separate chart totals scores that may be stored as integers or decimals.

## 2. Requirements — what the program must do

1. `lastOrDefault` returns the last list element, preserving its type.
2. For an empty list, return the supplied fallback.
3. `sumMetrics` adds numeric values from a list of any `Number` subtype.
4. Return the numeric sum as a `double`, including zero for an empty list.

## 3. Student task — what to submit

Complete the two generic methods with their existing signatures. Your implementation should work for multiple element types without requiring separate copies of the method for each type.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`lastOrDefault(["A", "B"], "none")` gives `"B"`; `sumMetrics([1, 2.5])` gives `3.5`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Generic APIs let teams build reusable, type-safe components for different kinds of data.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T36Test -Dexercise.run=P04T36 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T36`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
