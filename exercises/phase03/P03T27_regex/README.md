# P03T27 · Regex: Scanning School Equipment Labels

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T27`  
**Starter class:** `edu.practice.corejava.phase03.t27_regex.P03T27Exercise`  
**Validation class:** `P03T27Test`

**Primary topic:** Regex  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A school library and sports room put standardized stickers on items to simplify stocktaking. The scanner accepts labels only when every character follows the approved pattern.

## 2. Requirements — what the program must do

1. The full format is `ASSET-AAA-0000`.
2. `AAA` means exactly three uppercase English letters (`A` through `Z`).
3. `0000` means exactly four ASCII digits (`0` through `9`).
4. Reject lowercase codes, extra characters, leading/trailing spaces, malformed lengths, and null.

## 3. Student task — what to submit

Complete `isValidAssetTag(String assetTag)`. Return a Boolean for the entire label. A substring that happens to match is not sufficient; the whole input must be valid.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

`ASSET-BOK-0123` is valid; `ASSET-bok-0123` and `ASSET-BOK-01234` are not.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Format validation keeps inconsistent data out of inventory and registration systems.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T27Test -Dexercise.run=P03T27 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T27`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
