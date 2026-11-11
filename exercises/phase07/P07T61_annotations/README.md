# P07T61 · Annotations: Tracking Admin Actions

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T61`  
**Starter class:** `edu.practice.corejava.phase07.t61_annotations.P07T61Exercise`  
**Validation class:** `P07T61Test`

**Primary topic:** Annotations  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

An online shop records sensitive administrator operations such as charging a payment and issuing a refund. Developers label the relevant service methods so an audit tool can discover which actions require special logging.

## 2. Requirements — what the program must do

1. Find methods declared directly in the supplied service class with the `@Audited` annotation.
2. Read the annotation’s `action` text from each marked method.
3. Return the action values alphabetically sorted.
4. Ignore unannotated methods and inherited methods.

## 3. Student task — what to submit

Complete `auditActions(Class<?> serviceType)`. Use the provided runtime annotation contract. The answer must depend on annotations actually present in the class.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Methods annotated with actions `refund` and `charge` produce `[charge, refund]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Runtime annotations are widely used to declare metadata for auditing, validation, and framework behavior.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T61Test -Dexercise.run=P07T61 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T61`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
