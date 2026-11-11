# P02T18 · Access Modifiers: Protecting Customer Information

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T18`  
**Starter class:** `edu.practice.corejava.phase02.t18_access_control.P02T18Exercise`  
**Validation class:** `P02T18Test`

**Primary topic:** Access Modifiers  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A small banking app holds a customer name, account tier, branch identifier, and a secret PIN. Some of these details may be visible outside the class, while the PIN must not be directly exposed.

## 2. Requirements — what the program must do

1. `secretPin` must be private to the declaring class.
2. `accountTier` must be protected.
3. `branchCode` must have package-private visibility.
4. `publicName` must remain public.
5. Keep the existing field names and types unchanged.

## 3. Student task — what to submit

Update only the access declarations in `CustomerRecord`. This task is about defining a class boundary, not building a full banking workflow. Automated checks inspect the modifiers of the declared fields.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Code outside the class may access `publicName`, while `secretPin` must not be directly accessible.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Visibility modifiers help prevent accidental access to confidential or internal data.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T18Test -Dexercise.run=P02T18 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T18`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
