# P02T20 · Composition: Shopping Checkout with Messaging

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T20`  
**Starter class:** `edu.practice.corejava.phase02.t20_composition_design.P02T20Exercise`  
**Validation class:** `P02T20Test`

**Primary topic:** Composition  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A small online store delegates price calculation to a pricing service and sends the buyer an order message through a separate messaging service. The checkout code should continue working when either service is replaced.

## 2. Requirements — what the program must do

1. Ask the supplied `Pricing` collaborator to calculate the charge from the subtotal.
2. Call the supplied `Messenger` once, with the text `<buyer>:<charge>`.
3. Return the calculated charge.
4. Do not ignore either injected collaborator or construct a replacement inside checkout.

## 3. Student task — what to submit

Complete `CheckoutService.checkout(String buyer, int subtotal)`. The interfaces and constructor are already provided; your job is to make the checkout object coordinate its collaborators correctly.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

With a price calculator that adds `25`, buyer `Ava` and subtotal `500`, return `525` and send `Ava:525` once.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Composition and dependency injection make service components testable and replaceable.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T20Test -Dexercise.run=P02T20 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T20`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
