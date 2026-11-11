# P02T17 · Object Class: Customer Loyalty Card Identity

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T17`  
**Starter class:** `edu.practice.corejava.phase02.t17_object_contract.P02T17Exercise`  
**Validation class:** `P02T17Test`

**Primary topic:** Object Class  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shop issues loyalty card IDs. The same card may be reconstructed from two separate files, producing two Java objects that must still be recognized as the same logical card.

## 2. Requirements — what the program must do

1. A card identity consists of both the store/tenant code and customer ID.
2. Keys with matching values in both fields compare equal; different values are not equal.
3. Equal keys must produce matching hash codes.
4. The display form is `<tenant>/<customerId>`.

## 3. Student task — what to submit

Complete the standard object-contract behavior of `CustomerKey` without changing its public constructor. A newly created key should work correctly when compared with another key or used as a key in a collection.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Two `CustomerKey("north", "42")` objects are equal, but `CustomerKey("south", "42")` is different.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Value equality is essential for duplicate detection and reliable map/set lookup.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T17Test -Dexercise.run=P02T17 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T17`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
