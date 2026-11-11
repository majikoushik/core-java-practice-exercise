# P02T11 · Constructors: Event Promotion Campaign

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T11`  
**Starter class:** `edu.practice.corejava.phase02.t11_constructors.P02T11Exercise`  
**Validation class:** `P02T11Test`

**Primary topic:** Constructors  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An event organizer creates small promotional campaigns. Sometimes they start a blank draft; at other times the organizer already knows the event name and available spending budget.

## 2. Requirements — what the program must do

1. The no-argument constructor creates a campaign named `Untitled` with budget `0`.
2. The parameterized constructor preserves the given name and nonnegative budget.
3. `name()` and `budget()` must report the values belonging to that specific campaign object.

## 3. Student task — what to submit

Complete both constructors of `Campaign`, then its two read methods. A blank draft and a custom campaign must behave correctly when created independently.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`new Campaign()` has name `Untitled` and budget `0`; `new Campaign("Orientation", 5000)` has budget `5000`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Constructors define valid starting values for the objects used throughout an application.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T11Test -Dexercise.run=P02T11 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T11`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
