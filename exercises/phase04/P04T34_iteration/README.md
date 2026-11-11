# P04T34 · Iterators: Removing Expired Discount Coupons

**Phase 4: Collections and Generics**  
**Exercise ID:** `P04T34`  
**Starter class:** `edu.practice.corejava.phase04.t34_iteration.P04T34Exercise`  
**Validation class:** `P04T34Test`

**Primary topic:** Iterators  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shopping website keeps active discount coupons in a mutable map. Each coupon code is paired with the numbered day on which it expires. When staff open the dashboard, they want expired coupons removed.

## 2. Requirements — what the program must do

1. Remove entries whose expiry day is less than or equal to `today`.
2. Leave entries expiring on a later day untouched.
3. Modify the supplied mutable map **in place**.
4. Return the number of entries removed, not the number left.
5. Work correctly when nothing needs removal.

## 3. Student task — what to submit

Complete `purgeExpired(Map<String, Integer> expiryDays, int today)`. The caller will inspect the same map after the call, so making a separate replacement map is not sufficient.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

With `A=8`, `B=11`, `C=10` and `today=10`, remove `A` and `C` and return `2`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Real applications routinely clean expired cache entries, promotions, and sessions.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P04T34Test -Dexercise.run=P04T34 test
```

When all tests pass, mark your progress using `python tools/progress.py start P04T34`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
