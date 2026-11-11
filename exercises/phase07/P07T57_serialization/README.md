# P07T57 · Serialization: Saving a Game Session

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T57`  
**Starter class:** `edu.practice.corejava.phase07.t57_serialization.P07T57Exercise`  
**Validation class:** `P07T57Test`

**Primary topic:** Serialization  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A simple offline quiz game wants to save its own session identifier and number of attempts before the player closes the program. On restart, the app restores those values from bytes it created itself.

## 2. Requirements — what the program must do

1. `encode` returns a nonempty byte array representing the supplied `SessionSnapshot`.
2. `decode` reconstructs an equivalent snapshot, including its ID and attempts.
3. Encoding and decoding should round-trip an application-generated snapshot.
4. This exercise accepts only trusted, application-created serialized data.

## 3. Student task — what to submit

Complete `encode(SessionSnapshot snapshot)` and `decode(byte[] bytes)`. Work with the provided record type and method signatures; there is no file picker or external network data.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

A snapshot `("game-7", 4)` must be equal to the snapshot produced by decoding its encoded bytes.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Persistence features sometimes need to save and restore application state; native Java deserialization must not be used on untrusted input.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T57Test -Dexercise.run=P07T57 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T57`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
