# P04T29 · Collections: Counting Customer Support Questions

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T29`  
**Starter class:** `edu.practice.corejava.phase04.t29_collection_hierarchy.P04T29Exercise`  
**Validation class:** `P04T29Test`

**Primary topic:** Collections  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A small store runs a customer helpdesk. Every incoming question is assigned a simple category such as `delivery`, `payment`, or `returns`. At the end of the day, staff need to see how frequently each category occurred.

## 2. Requirements — what the program must do

1. Accept any `Collection<String>` of issue-category names.
2. Return a map with each category and its number of appearances.
3. Keep category keys in order of their **first** appearance in the input.
4. Return an empty map if there are no reports.

## 3. Student task — what to submit

Complete `frequencyByIssue(Collection<String> issues)`. Create and return the summary; do not modify the caller’s collection. The exercise is about working with the Java collection abstraction, not about reading a database.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

For `[delivery, returns, delivery, payment]`, report `delivery=2`, `returns=1`, `payment=1` in that key order.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Category counts are widely used in dashboards, web analytics, and service-desk reports.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T29Test -Dexercise.run=P04T29 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T29`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
