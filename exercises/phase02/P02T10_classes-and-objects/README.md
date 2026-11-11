# P02T10 · Classes and Objects: Sports Club Equipment Loans

**Phase 2: Object-Oriented Programming**  
**Exercise ID:** `P02T10`  
**Starter class:** `edu.practice.corejava.phase02.t10_classes_and_objects.P02T10Exercise`  
**Validation class:** `P02T10Test`

**Primary topic:** Classes and Objects  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A college sports club lends badminton rackets and footballs to students. Each physical item has a code and can be borrowed by only one student at a time. Two rackets must maintain their availability independently.

## 2. Requirements — what the program must do

1. A newly created item must be available.
2. `code()` must return its original item identifier.
3. The first successful `checkout()` changes that item to unavailable and returns true.
4. Checking out an already borrowed item returns false; returning it makes it available again.
5. Changing one item must not affect a separate item.

## 3. Student task — what to submit

Complete the starter nested class `Equipment`, including its state-related methods. Use one instance per sports item. The existing constructor identifies the item; write behavior for borrowing and returning without changing the class API.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Item `RACKET-1` is initially available. Its first checkout succeeds, its second checkout fails, and after `returnItem()` it is available again.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Object state models individual records like rented bikes, library books, and shopping-cart entries.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P02T10Test -Dexercise.run=P02T10 test
```

When all tests pass, mark your progress using `python tools/progress.py start P02T10`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
