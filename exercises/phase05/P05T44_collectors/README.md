# P05T44 · Collectors: Workshop Participants by City and Age

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T44`  
**Starter class:** `edu.practice.corejava.phase05.t44_collectors.P05T44Exercise`  
**Validation class:** `P05T44Test`

**Primary topic:** Collectors  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A city-wide workshop collects applicants from different cities. Organizers need the number of applicants from each city and separate lists of adults and minors for registration handling.

## 2. Requirements — what the program must do

1. `countByCity` returns how many applicants belong to each city.
2. `partitionEligible` returns both Boolean groups: `true` for age at least 18, `false` otherwise.
3. Preserve the original order of participants within each age group.
4. Use the supplied name, city, and age fields.

## 3. Student task — what to submit

Complete both `countByCity` and `partitionEligible`. Keep the two reports logically distinct: one is a frequency table and the other is a partition of the original participants.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Applicants from Pune (19), Delhi (16), Pune (20) give city counts `{Pune=2, Delhi=1}` and adult/minor groups of sizes 2 and 1.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Grouping and partitioning power reports, dashboards, and filtered administrative views.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T44Test -Dexercise.run=P05T44 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T44`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
