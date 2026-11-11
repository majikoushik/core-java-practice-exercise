# P03T28 · Enums: Tracking Online Shopping Orders

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T28`  
**Starter class:** `edu.practice.corejava.phase03.t28_enums.P03T28Exercise`  
**Validation class:** `P03T28Test`

**Primary topic:** Enums  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shopping app tracks an order from creation through payment, packing, and shipping. Staff should not be able to skip mandatory stages or move an order backwards.

## 2. Requirements — what the program must do

1. The only permitted transitions are `CREATED` → `PAID`, `PAID` → `PACKED`, and `PACKED` → `SHIPPED`.
2. Every other transition is forbidden, including transitions from a stage to itself.
3. Return a Boolean decision; do not change or create an order record.

## 3. Student task — what to submit

Complete `mayTransition(OrderStage from, OrderStage to)` using the supplied enum values. Treat this as a validation rule for a button that moves an order to a new stage.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Moving `PAID` to `PACKED` is allowed; moving `CREATED` directly to `SHIPPED` is not.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Enumerated states make workflows readable and prevent invalid application transitions.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T28Test -Dexercise.run=P03T28 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T28`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
