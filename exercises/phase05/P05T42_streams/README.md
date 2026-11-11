# P05T42 · Streams: Exporting a Shopping Product Catalog

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T42`  
**Starter class:** `edu.practice.corejava.phase05.t42_streams.P05T42Exercise`  
**Validation class:** `P05T42Test`

**Primary topic:** Streams  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An online store shares an active-products list with another service. Some catalog entries are disabled, and a product code may appear more than once. The exported list must contain clean, unique codes.

## 2. Requirements — what the program must do

1. Include codes from **active** catalog records only.
2. Convert every included product code to uppercase.
3. Remove duplicate codes after transformation.
4. Sort the resulting codes in ascending order.
5. Leave the original catalog list unchanged.

## 3. Student task — what to submit

Complete `activeSkuExport(List<CatalogEntry> catalog)`. Return the final exported codes as a list. The provided catalog entries already contain a product code and active flag.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

If active codes include `ab1`, `AB1`, and `dc3`, the export is `[AB1, DC3]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Backend systems transform collections into cleaned reports and integration payloads.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T42Test -Dexercise.run=P05T42 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T42`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
