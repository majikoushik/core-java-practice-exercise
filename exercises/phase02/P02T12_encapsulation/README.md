# P02T12 · Encapsulation: Prepaid Canteen Wallet

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T12`  
**Starter class:** `edu.practice.corejava.phase02.t12_encapsulation.P02T12Exercise`  
**Validation class:** `P02T12Test`

**Primary topic:** Encapsulation  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

Students can load money into a prepaid wallet and use it at a campus canteen. The wallet must protect its balance from invalid operations and from spending more money than the student has.

## 2. Requirements — what the program must do

1. Initial balance is zero.
2. A deposit adds a positive amount; a spend subtracts a positive amount.
3. Reject zero or negative deposits and spends.
4. Reject spending above the available balance with `IllegalArgumentException`.
5. An invalid operation must leave the existing balance unchanged.

## 3. Student task — what to submit

Implement the three public operations of `Wallet`: `deposit`, `spend`, and `balance`. Keep the balance consistent across a sequence of transactions and make the class usable by multiple independent wallet objects.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

After depositing `200` and spending `20`, the balance is `180`. Trying to spend `181` fails and the balance remains `180`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Payment systems and account objects enforce invariants instead of trusting every caller.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T12Test -Dexercise.run=P02T12 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T12`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
