# P04T33 · Maps: Updating a Grocery Store Stock List

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T33`  
**Starter class:** `edu.practice.corejava.phase04.t33_maps.P04T33Exercise`  
**Validation class:** `P04T33Test`

**Primary topic:** Maps  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A neighborhood grocery shop records available quantities by item code. In the morning, a delivery arrives with additional quantities. The shop wants an updated stock report without changing yesterday’s records.

## 2. Requirements — what the program must do

1. Combine the existing quantity and delivered quantity for every matching item code.
2. A new item code begins with an existing stock of zero.
3. Return a **new** map containing the updated amounts.
4. Do not modify either input map.
5. Quantities are supplied as nonnegative integers.

## 3. Student task — what to submit

Complete `receiveStock(Map<String, Integer> current, Map<String, Integer> delivered)`. The map keys are product identifiers and the values are quantities. Return the merged inventory ready for display.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

If stock has `MILK=3` and delivery has `MILK=4, BREAD=2`, the result has `MILK=7, BREAD=2`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Inventory updates, shopping carts, and frequency reports rely on map-based lookup and merging.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T33Test -Dexercise.run=P04T33 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T33`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
