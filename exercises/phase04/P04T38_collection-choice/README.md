# P04T38 · Choosing Collections: Website User Roles

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T38`  
**Starter class:** `edu.practice.corejava.phase04.t38_collection_choice.P04T38Exercise`  
**Validation class:** `P04T38Test`

**Primary topic:** Choosing Collections  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A website administrator assigns permissions to roles such as `reader`, `editor`, and `admin`. The import file may repeat the same permission several times. The screen must show roles in arrival order and each permission only once.

## 2. Requirements — what the program must do

1. Group grants by role.
2. Within each role keep unique permissions.
3. Preserve the role ordering according to first appearance.
4. Preserve each permission’s first-appearance order within its role.
5. Return an empty result for no grants.

## 3. Student task — what to submit

Complete `permissionsByRole(List<Grant> grants)`. Build the role-to-permissions view from the supplied records. Both the outer map ordering and the sets’ ordering matter.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Grants `(reader,view), (admin,edit), (reader,view), (reader,export)` give `reader=[view,export]`, `admin=[edit]` in that role order.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Choosing the correct collection impacts ordering, duplicate handling, and correctness.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T38Test -Dexercise.run=P04T38 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T38`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
