# P06T52 · Concurrent Collections: Student Council Vote Counting

**Phase 6: Multithreading and Concurrency**  
**Exercise ID:** `P06T52`  
**Starter class:** `edu.practice.corejava.phase06.t52_concurrent_collections.P06T52Exercise`  
**Validation class:** `P06T52Test`

**Primary topic:** Concurrent Collections  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

During a student-council election, thousands of vote records arrive close together. Each vote contains a candidate ID. The final tally must account for every vote, even when votes are processed concurrently.

## 2. Requirements — what the program must do

1. Count votes by candidate into a map.
2. Do not lose or duplicate votes when processing concurrently.
3. Each candidate ID appears once with its full count.
4. An empty input produces an empty map.
5. No ordering of candidate keys is required.

## 3. Student task — what to submit

Complete `tallyVotes(List<String> votes)`. The list is the complete set of received votes; return totals that match the number of occurrences for each candidate.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

2,000 votes for `A` and 4,000 for `B` must produce `{A=2000, B=4000}`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Thread-safe collections are needed when several workers update shared reports.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P06T52Test -Dexercise.run=P06T52 test
```

When all tests pass, mark your progress using `python tools/progress.py start P06T52`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
