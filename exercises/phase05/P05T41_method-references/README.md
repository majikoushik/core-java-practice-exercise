# P05T41 · Method References: Cleaning a Contact List

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T41`  
**Starter class:** `edu.practice.corejava.phase05.t41_method_references.P05T41Exercise`  
**Validation class:** `P05T41Test`

**Primary topic:** Method References  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A user imports contacts from a messaging app. The imported list has names surrounded by spaces and occasional blank entries. Before displaying the contacts, the app needs a clean alphabetical view.

## 2. Requirements — what the program must do

1. Trim spaces surrounding every name.
2. Discard empty names after trimming.
3. Sort the remaining names alphabetically using case-sensitive comparison.
4. Return a new list without modifying the imported list.

## 3. Student task — what to submit

Complete `cleanDirectory(List<String> names)`. Produce only the cleaned and sorted names; no user interface or file import is necessary.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Names `[" Zoe ", "", " Anna", "Ben "]` become `["Anna", "Ben", "Zoe"]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Cleaning, transformation, and ordering steps are common in contact apps and data import systems.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T41Test -Dexercise.run=P05T41 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T41`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
