# P04T32 · Queue and Deque: Customer Service Priority

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T32`  
**Starter class:** `edu.practice.corejava.phase04.t32_queues_and_deques.P04T32Exercise`  
**Validation class:** `P04T32Test`

**Primary topic:** Queue and Deque  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A customer-support kiosk receives two separate lines: customers with urgent account-lock issues and customers with ordinary questions. The operator serves urgent customers first, but should respect arrival order within each line.

## 2. Requirements — what the program must do

1. Return one combined service order containing all urgent IDs before ordinary IDs.
2. Preserve the original order inside the urgent group and inside the routine group.
3. Do not modify either input list.
4. If either group is empty, return the other group in the same order.

## 3. Student task — what to submit

Complete `serviceOrder(List<String> urgentIds, List<String> routineIds)`. Use the two lists as already-recorded arrival sequences; return the service sequence as a new list.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Urgent `[U1, U2]` and routine `[R1, R2]` result in `[U1, U2, R1, R2]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Queues represent work waiting to be served, while deques support controlled insertion and removal from either end.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T32Test -Dexercise.run=P04T32 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T32`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
