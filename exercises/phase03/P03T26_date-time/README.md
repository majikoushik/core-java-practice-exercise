# P03T26 · Date and Time: Online Order Delivery Planning

**Phase 3: Essential Java APIs**  
**Exercise ID:** `P03T26`  
**Starter class:** `edu.practice.corejava.phase03.t26_date_time.P03T26Exercise`  
**Validation class:** `P03T26Test`

**Primary topic:** Date and Time  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An online shop promises to dispatch orders after a specified number of working days, but its dispatch team does not work on weekends. A second screen shows order updates in the customer’s own time zone.

## 2. Requirements — what the program must do

1. For `dispatchDate`, advance by the specified number of Monday–Friday working days; Saturday and Sunday do not count.
2. A lead time of zero returns the original date, even if it falls on a weekend.
3. For `localizeInstant`, display the supplied instant in the selected time zone without changing the underlying instant.
4. The lead-day count is nonnegative.

## 3. Student task — what to submit

Complete both date/time operations. The dates are provided as Java time objects; do not use today’s calendar date as an unstated input. The second operation should represent the **same moment** for a user in another region.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

An order placed Thu 12 Nov 2026 with 2 business days dispatches Mon 16 Nov 2026. A `12:00 UTC` instant displays as `17:30` in Kolkata.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Shops, travel apps, and reminders must distinguish calendar dates, business days, and time zones.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P03T26Test -Dexercise.run=P03T26 test
```

When all tests pass, mark your progress using `python tools/progress.py start P03T26`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
