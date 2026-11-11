# P05T45 · Optional: Sending Verified Email Receipts

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T45`  
**Starter class:** `edu.practice.corejava.phase05.t45_optional.P05T45Exercise`  
**Validation class:** `P05T45Test`

**Primary topic:** Optional  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An online bookstore emails receipts only when a customer has verified an email address. Some accounts have no address or contain whitespace from an incomplete signup process.

## 2. Requirements — what the program must do

1. Return an `Optional` containing the trimmed email only for verified customers with a nonblank email.
2. Return an empty `Optional` for unverified customers.
3. Return empty for a missing (null) or blank email, even if the account is verified.
4. Never return `null` instead of an `Optional`.

## 3. Student task — what to submit

Complete `verifiedEmail(Customer customer)`. The `Customer` record holds an email string and a verification flag. The caller will decide what to do when no usable address is available.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A verified address `" a@b.org "` becomes `Optional.of("a@b.org")`; a verified blank address gives `Optional.empty()`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Optional values make absence explicit when looking up profile data and contact information.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T45Test -Dexercise.run=P05T45 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T45`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
