# P07T59 · Memory Management: Clearing an Image Preview

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T59`  
**Starter class:** `edu.practice.corejava.phase07.t59_memory_management.P07T59Exercise`  
**Validation class:** `P07T59Test`

**Primary topic:** Memory Management  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A photo-viewing app temporarily keeps image bytes while the user previews a picture. Once the preview is closed, the application should no longer retain a reference to the large byte array.

## 2. Requirements — what the program must do

1. A new holder reports the size of its initial retained byte array.
2. `currentSize()` returns zero when no payload is retained.
3. `release()` clears the reference held by the object, not just the displayed size.
4. Calling `release()` should leave the holder in a consistent empty state.

## 3. Student task — what to submit

Complete `PayloadHolder.currentSize()` and `PayloadHolder.release()`. The validation checks both reported size and whether the stored reference has actually been cleared.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

An image of 2,048 bytes reports size `2048` before release and `0` afterward.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Understanding object references helps applications avoid retaining memory after data is no longer needed.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T59Test -Dexercise.run=P07T59 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T59`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
