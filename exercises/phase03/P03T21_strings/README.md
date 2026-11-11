# P03T21 · Strings: Blog URLs and Activity History

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T21`  
**Starter class:** `edu.practice.corejava.phase03.t21_strings.P03T21Exercise`  
**Validation class:** `P03T21Test`

**Primary topic:** Strings  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A community blogging website creates simple readable URLs from article headlines. A separate admin page displays recent activity events on one line.

## 2. Requirements — what the program must do

1. For a headline, remove surrounding spaces, convert letters to lowercase, and replace each run of internal spaces with one hyphen.
2. If the headline contains only spaces, return an empty string.
3. For a sequence of event names, join them with the exact separator `
4. `, preserving their order.
5. An empty event list produces an empty string.

## 3. Student task — what to submit

Complete `articleSlug(String headline)` and `auditLine(List<String> events)`. Both methods return text; they must not modify the input list or print output.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`"  Java   in Production "` becomes `"java-in-production"`; events `[LOGIN, READ, LOGOUT]` become `LOGIN | READ | LOGOUT`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Text normalization and display formatting occur in websites, search tools, and system logs.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T21Test -Dexercise.run=P03T21 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T21`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
