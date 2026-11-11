# P04T31 · Sets: Detecting Repeated Entry Pass Scans

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T31`  
**Starter class:** `edu.practice.corejava.phase04.t31_sets.P04T31Exercise`  
**Validation class:** `P04T31Test`

**Primary topic:** Sets  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

Staff scan QR codes at a school festival entrance. Some tickets are accidentally scanned twice or more. The report should list which ticket IDs were repeated, following the order in which they first became duplicates.

## 2. Requirements — what the program must do

1. Return only IDs occurring at least twice.
2. Each repeated ID should appear once in the returned set.
3. The set iteration order must follow the time each ID first reached its **second** occurrence.
4. A list with all unique IDs must produce an empty set.

## 3. Student task — what to submit

Complete `duplicateBadgeIds(List<String> scans)`. Treat the scans as an ordered event log; the result is a set of ticket codes that need review.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Scans `[A, B, A, C, B]` produce duplicates in the order `[A, B]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Sets are a natural choice for uniqueness checks, deduplication, and membership tests.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T31Test -Dexercise.run=P04T31 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T31`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
