# P02T16 · Keywords: Standard and VIP Event Passes

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T16`  
**Starter class:** `edu.practice.corejava.phase02.t16_keywords.P02T16Exercise`  
**Validation class:** `P02T16Test`

**Primary topic:** Keywords  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

At a concert entrance, staff scan standard passes and VIP passes. The scanner must label a recognized pass correctly and report unknown items without crashing.

## 2. Requirements — what the program must do

1. Return `VIP` for a `VipPass` object and `STANDARD` for an ordinary `StandardPass`.
2. Return `UNKNOWN` for null and unrelated objects.
3. Preserve the identifier passed to either pass constructor.
4. Do not change the supplied class hierarchy or the `FACILITY` constant.

## 3. Student task — what to submit

Complete the ID reporting method and `passTier(Object pass)`. Treat a VIP pass as a kind of standard pass that must still be identified specifically as VIP.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`passTier(new VipPass("X1"))` returns `VIP`; `passTier("visitor")` returns `UNKNOWN`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Java’s type and object keywords matter when APIs accept objects from different callers.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T16Test -Dexercise.run=P02T16 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T16`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
