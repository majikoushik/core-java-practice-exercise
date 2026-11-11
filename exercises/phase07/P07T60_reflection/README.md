# P07T60 · Reflection: Reading App Configuration Fields

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T60`  
**Starter class:** `edu.practice.corejava.phase07.t60_reflection.P07T60Exercise`  
**Validation class:** `P07T60Test`

**Primary topic:** Reflection  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A desktop application has configuration fields such as server address, region, and display theme. An admin page should list only fields that developers explicitly marked as configurable.

## 2. Requirements — what the program must do

1. Inspect fields declared directly in the supplied class.
2. Select only fields carrying the supplied `@ConfigValue` annotation.
3. Return those field names sorted alphabetically.
4. Ignore fields without the annotation and fields inherited from parent classes.
5. Return an empty list when there are no matches.

## 3. Student task — what to submit

Complete `configuredFields(Class<?> type)`. The test supplies sample classes containing annotated fields, so your code should discover metadata from the given class rather than use a predefined list.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A class with annotated fields `region` and `host` should produce `[host, region]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Reflection helps frameworks inspect code metadata during configuration and startup.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T60Test -Dexercise.run=P07T60 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T60`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
