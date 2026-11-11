# P04T37 · HashMap Internals: Identifying Products Across Stores

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T37`  
**Starter class:** `edu.practice.corejava.phase04.t37_hashmap_internals.P04T37Exercise`  
**Validation class:** `P04T37Test`

**Primary topic:** HashMap Internals  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

The same product code can be stocked in several grocery branches. A product is uniquely identified by **both** its store code and the product code; the same product code in different stores represents separate inventory.

## 2. Requirements — what the program must do

1. A `StockKey` must compare equal only when both store/warehouse code and SKU match.
2. Equal keys must have consistent hash codes.
3. `lookup` returns the quantity for that complete key, or zero when absent.
4. Lookups must still work if two different keys happen to share a hash code.

## 3. Student task — what to submit

Complete the value-identity behavior in `StockKey` and the `lookup` method. Treat the store code and SKU as a pair, never as two unrelated searches.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

An item with code `APPLE` in store `N` can have quantity `10`, while the same code in store `S` can have quantity `20`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Hash-based collections require reliable equality contracts to avoid incorrect retrieval.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T37Test -Dexercise.run=P04T37 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T37`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
