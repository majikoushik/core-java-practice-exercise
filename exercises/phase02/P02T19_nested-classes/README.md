# P02T19 · Nested Classes: Conference Attendance Badges

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T19`  
**Starter class:** `edu.practice.corejava.phase02.t19_nested_classes.P02T19Exercise`  
**Validation class:** `P02T19Test`

**Primary topic:** Nested Classes  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A college organizes a technology conference. Every participant has a conference pass, and each attended talk is attached to that particular participant. Separately, badges can be printed before a person is assigned to a pass.

## 2. Requirements — what the program must do

1. A badge label must be `BADGE-<code>`.
2. An attendance entry must summarize its enclosing pass holder and the session in the form `<holder>:<session>`.
3. A badge can exist independently of a `ConferencePass` instance.
4. Different conference passes must keep their attendance details separate.

## 3. Student task — what to submit

Complete `Badge.label()` and `AttendanceEntry.summary()` in the provided nested-class structure. Keep the existing static nested badge and non-static attendance entry design.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A badge with code `A7` becomes `BADGE-A7`. Mira’s attendance at Keynote becomes `Mira:Keynote`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Nested types are useful for values and records closely tied to another class.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T19Test -Dexercise.run=P02T19 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T19`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
