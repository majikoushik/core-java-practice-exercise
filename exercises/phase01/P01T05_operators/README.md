# P01T05 · Operators: App Feature Switches

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T05`  
**Starter class:** `edu.practice.corejava.phase01.t05_operators.P01T05Exercise`  
**Validation class:** `P01T05Test`

**Primary topic:** Operators  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A simple mobile app can turn features such as notifications, dark mode, and location sharing on or off. For compact storage, the app represents the enabled features in one integer; each feature occupies its own individual bit.

## 2. Requirements — what the program must do

1. Receive the existing integer mask, a single-bit feature value, and an enable/disable flag.
2. Turn **only** the chosen feature on when enabled or off when disabled.
3. Keep all other feature bits unchanged, including those already on.

## 3. Student task — what to submit

Complete `updatePermission(int currentMask, int permissionBit, boolean enable)`. Treat `permissionBit` as exactly one selected feature and return the updated mask. Do not replace the mask with a completely new value.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

With current mask `1010` (binary), enabling `0100` gives `1110`; disabling `0010` gives `1000`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Individual flags occur in app preferences, permissions, game settings, and device configuration.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T05Test -Dexercise.run=P01T05 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T05`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
