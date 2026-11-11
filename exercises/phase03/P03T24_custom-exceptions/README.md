# P03T24 · Custom Exceptions: Reserving Event Seats

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T24`  
**Starter class:** `edu.practice.corejava.phase03.t24_custom_exceptions.P03T24Exercise`  
**Validation class:** `P03T24Test`

**Primary topic:** Custom Exceptions  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A college event has a limited number of seats. Students reserve groups of seats, and the booking interface needs a special error when the request is larger than the remaining capacity.

## 2. Requirements — what the program must do

1. Return the number of seats remaining after a positive, affordable reservation.
2. If requested seats exceed available seats, throw `QuotaExceededException`.
3. The exception must report the original `requested` and `available` values through its accessors.
4. A nonpositive request is invalid; keep this separate from insufficient capacity.

## 3. Student task — what to submit

Complete `reserve(int available, int requested)` and any unfinished behavior necessary in the supplied custom exception. The failure must carry enough information for a booking screen to display a useful message.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Reserving `5` of `8` seats leaves `3`. Requesting `7` when `4` remain raises an exception reporting `7` and `4`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Domain-specific exceptions give callers meaningful failure details without parsing error strings.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T24Test -Dexercise.run=P03T24 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T24`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
