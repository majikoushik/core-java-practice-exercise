# P01T03 · Program Structure: Student Club Membership IDs

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T03`  
**Starter class:** `edu.practice.corejava.phase01.t03_program_structure.P01T03Exercise`  
**Validation class:** `P01T03Test`

**Primary topic:** Program Structure  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A college has sports, arts, and coding clubs. Each club assigns membership IDs with the same standard format so that registrations can be recognized across different club applications.

## 2. Requirements — what the program must do

1. Create an ID in the format `<CLUB>-<YEAR>-<FOUR-DIGIT-SEQUENCE>`.
2. The club code is already uppercase and the sequence is from 0 through 9999.
3. Always show four sequence digits, including leading zeros; do not change the year or club code.

## 3. Student task — what to submit

Complete `registrationId(String department, int year, int sequence)`. Use the existing method parameters as the club code, calendar year, and serial number. Return the complete identifier; the tests will check exact punctuation.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`registrationId("ART", 2026, 7)` must return `ART-2026-0007`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Consistent identifiers let separate parts of a software system refer to the same record.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T03Test -Dexercise.run=P01T03 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T03`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
