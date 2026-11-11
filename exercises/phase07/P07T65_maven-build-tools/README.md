# P07T65 · Maven: Reading Project Coordinates

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T65`  
**Starter class:** `edu.practice.corejava.phase07.t65_maven_build_tools.P07T65Exercise`  
**Validation class:** `P07T65Test`

**Primary topic:** Maven  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A developer tool scans a Maven project and shows its official identity as group ID, artifact ID, and version. A project POM can also contain dependencies and plugins with similar-looking identifiers, so the tool must identify the project itself.

## 2. Requirements — what the program must do

1. Read the supplied `pom.xml` path.
2. Extract the direct project-level `groupId`, `artifactId`, and `version` elements.
3. Return `<groupId>:<artifactId>:<version>`.
4. Do not accidentally take coordinates from a nested dependency or plugin.
5. The exercise inputs have all three direct project-level elements.

## 3. Student task — what to submit

Complete `projectCoordinates(Path pomFile)`. A sample POM is created by the tests; the output must reflect that document, not the name or location of this training repository.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

For project coordinates `org.demo`, `books`, `1.2.0`, return `org.demo:books:1.2.0`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Build tools use Maven coordinates to identify artifacts and resolve dependencies.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T65Test -Dexercise.run=P07T65 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T65`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
