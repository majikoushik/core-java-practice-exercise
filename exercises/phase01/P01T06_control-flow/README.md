# P01T06 · Conditions and Switch: Museum Entry and Helpdesk

**Phase 1: Java Fundamentals**  
**Exercise ID:** `P01T06`  
**Starter class:** `edu.practice.corejava.phase01.t06_control_flow.P01T06Exercise`  
**Validation class:** `P01T06Test`

**Primary topic:** Conditions and Switch  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A museum has a simple entry rule for visitors and a separate information counter that routes questions to the right team. These two mini-tasks represent everyday decisions made from input values.

## 2. Requirements — what the program must do

1. Entry: under age 6 is `FREE`, even without a ticket.
2. Everyone aged 6 or older with a ticket receives `ADMIT`; otherwise return `DENY`.
3. Helpdesk: `billing` maps to `PAYMENT`, `technical` maps to `SUPPORT`, and all other strings map to `GENERAL`.
4. Helpdesk matching is case-sensitive; return the decision rather than printing it.

## 3. Student task — what to submit

Complete both `admissionDecision(int age, boolean hasTicket)` and `helpdeskRoute(String requestType)`. Keep each method responsible for its own decision. Both methods must return the exact uppercase status specified above.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A 5-year-old without a ticket receives `FREE`. The request `technical` is routed to `SUPPORT`, but `Technical` is routed to `GENERAL`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Most apps contain simple business rules for eligibility, access, categories, and routing.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P01T06Test -Dexercise.run=P01T06 test
```

When all tests pass, mark your progress using `python tools/progress.py start P01T06`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
