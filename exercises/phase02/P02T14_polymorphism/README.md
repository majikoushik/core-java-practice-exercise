# P02T14 · Polymorphism: Online Shopping Discounts

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T14`  
**Starter class:** `edu.practice.corejava.phase02.t14_polymorphism.P02T14Exercise`  
**Validation class:** `P02T14Test`

**Primary topic:** Polymorphism  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A shopping website sometimes offers a fixed-amount coupon and sometimes a percentage discount. The checkout screen should apply either offer without changing the checkout calculation workflow.

## 2. Requirements — what the program must do

1. `FlatDiscount` represents a fixed amount reduction.
2. `PercentDiscount` represents an integer percentage from 0 to 100; fractional discounts are rounded down.
3. `totalAfterDiscount(subtotal, policy)` uses the supplied policy and never returns a negative charge.
4. The overloaded version receiving only `subtotal` applies no discount and returns that subtotal unchanged.

## 3. Student task — what to submit

Complete both discount implementations and both overloaded checkout methods. Treat the policy as a replaceable object: the checkout method must work with any implementation of the declared `Discount` interface.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

At subtotal `1000`, a 20% coupon gives `800`; a fixed `50` coupon gives `950`. A coupon cannot make the total negative.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Checkout systems use polymorphism to add new promotions without rewriting existing services.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T14Test -Dexercise.run=P02T14 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T14`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
