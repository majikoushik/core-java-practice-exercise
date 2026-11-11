# P03T22 · Wrapper Classes: Missing Numbers in a Survey

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T22`  
**Starter class:** `edu.practice.corejava.phase03.t22_wrappers.P03T22Exercise`  
**Validation class:** `P03T22Test`

**Primary topic:** Wrapper Classes  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An online school survey exports optional numeric responses into a CSV-like table. Some cells are blank because students skipped the question. A blank response must not be confused with the number zero.

## 2. Requirements — what the program must do

1. For null input or text containing only spaces, return `null`.
2. For other text, parse an integer and return it as `Integer`.
3. Allow zero and nonnegative whole numbers.
4. Reject negative numbers and non-numeric values with `IllegalArgumentException`.

## 3. Student task — what to submit

Complete `parseOptionalCount(String cellValue)`. Do not convert an absent answer to zero; the caller needs to distinguish missing information from a real count.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`"  "` gives `null`, `" 0 "` gives `Integer.valueOf(0)`, and `"abc"` is invalid.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Wrappers allow numeric values to be nullable when importing imperfect real-world data.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T22Test -Dexercise.run=P03T22 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T22`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
