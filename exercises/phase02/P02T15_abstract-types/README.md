# P02T15 · Abstraction: Email and SMS Notifications

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T15`  
**Starter class:** `edu.practice.corejava.phase02.t15_abstract_types.P02T15Exercise`  
**Validation class:** `P02T15Test`

**Primary topic:** Abstraction  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A movie-ticket booking website sends booking updates through email or text message. Its booking service should work with either channel without needing to know the details of that channel.

## 2. Requirements — what the program must do

1. The email channel returns `EMAIL:<recipient>:<message>`.
2. The SMS channel returns `SMS:<recipient>:<message>`.
3. Both classes must satisfy the existing `NotificationChannel` contract.
4. The abstract alert exercise formats `SystemAlert.format("Disk Full")` as `SYS:Disk Full`.

## 3. Student task — what to submit

Finish the two concrete notification channels and the supplied abstract-alert subtype. Keep the provided interface and abstract base type intact; write the behavior expected when each concrete type is used.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Delivering `Ready` to recipient `alice` using email produces `EMAIL:alice:Ready`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Interfaces and abstract classes separate a service contract from delivery-specific behavior.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T15Test -Dexercise.run=P02T15 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T15`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
