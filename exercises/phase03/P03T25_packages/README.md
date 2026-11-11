# P03T25 · Packages: Routes for College Service Desks

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T25`  
**Starter class:** `edu.practice.corejava.phase03.t25_packages.P03T25Exercise`  
**Validation class:** `P03T25Test`

**Primary topic:** Packages  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A college has separate service desks for Arts, Sports, and Admissions. They all use the same organization prefix in their internal route labels, which is supplied by another Java package.

## 2. Requirements — what the program must do

1. Produce `<SHARED-PREFIX>/<DEPARTMENT-CODE>`.
2. Remove spaces at the beginning and end of the supplied department name.
3. Convert the department code to uppercase.
4. Use the shared prefix already declared in the project instead of inventing a different one.

## 3. Student task — what to submit

Complete `departmentRoute(String department)`. The supplied input is nonnull and nonempty once trimmed. The goal is to produce a consistent route label across packages.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

With the existing shared prefix, `departmentRoute(" art ")` returns `ORG/ART`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Package boundaries and shared constants prevent inconsistent naming across application modules.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T25Test -Dexercise.run=P03T25 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T25`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
