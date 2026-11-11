# P02T13 · Inheritance: Standard and Express Parcel Delivery

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T13`  
**Starter class:** `edu.practice.corejava.phase02.t13_inheritance.P02T13Exercise`  
**Validation class:** `P02T13Test`

**Primary topic:** Inheritance  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A parcel-delivery shop offers regular delivery and express delivery. Both services charge based on parcel weight, but express delivery has an additional fixed surcharge.

## 2. Requirements — what the program must do

1. A standard parcel costs `12` per kilogram.
2. An express parcel costs the standard fee plus `75`.
3. Parcel weight is a positive whole number.
4. The express object should behave as a specialized form of standard shipment.

## 3. Student task — what to submit

Complete the fee behavior in `StandardShipment` and `ExpressShipment`. Keep their existing parent-child relationship and ensure callers can ask either type for its delivery charge.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A 3 kg standard parcel costs `36`; the corresponding express parcel costs `111`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Inheritance is useful when closely related kinds of objects share a stable common contract.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T13Test -Dexercise.run=P02T13 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T13`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
