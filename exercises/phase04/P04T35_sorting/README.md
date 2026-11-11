# P04T35 · Sorting: Employee Directory and Experience

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T35`  
**Starter class:** `edu.practice.corejava.phase04.t35_sorting.P04T35Exercise`  
**Validation class:** `P04T35Test`

**Primary topic:** Sorting  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A company displays employee records in two ways: a seniority view showing more experienced employees first, and a team directory grouped by team name. The records should be reusable between the two views.

## 2. Requirements — what the program must do

1. Natural employee ordering: higher `yearsExperience` first; break ties by `name` ascending.
2. `teamDirectory` sorts by team ascending, then name ascending.
3. `teamDirectory` must return a new list and leave the original list untouched.
4. Sorting should be deterministic for the specified fields.

## 3. Student task — what to submit

Complete the natural-order behavior of `Employee` and the separate `teamDirectory(List<Employee> employees)` view. Keep the supplied record fields intact.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

In seniority order, an employee with 5 years comes before one with 2; in the directory, the `Design` team appears before `Sales`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Apps often need multiple sorting policies for the same records, such as seniority and alphabetical views.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T35Test -Dexercise.run=P04T35 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T35`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
