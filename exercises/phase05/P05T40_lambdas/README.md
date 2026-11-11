# P05T40 · Lambda Expressions: Minimum Order Filter

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T40`  
**Starter class:** `edu.practice.corejava.phase05.t40_lambdas.P05T40Exercise`  
**Validation class:** `P05T40Test`

**Primary topic:** Lambda Expressions  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shopping app offers users a filter called “Orders above ₹500.” The value can change, so the app needs a reusable condition representing the selected minimum total.

## 2. Requirements — what the program must do

1. Return a `Predicate<Purchase>` for the supplied nonnegative threshold.
2. Accept a purchase when its total is greater than or equal to that threshold.
3. Reject purchases below the threshold.
4. Exactly matching the threshold must be accepted.

## 3. Student task — what to submit

Complete `minimumPurchaseRule(int threshold)`. Your result should be a rule that the caller can apply to many purchases, not a one-time Boolean for a single purchase.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A minimum of `500` accepts an order of `500` and rejects an order of `499`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Predicates are widely used for search filters and configurable validation rules.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T40Test -Dexercise.run=P05T40 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T40`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
