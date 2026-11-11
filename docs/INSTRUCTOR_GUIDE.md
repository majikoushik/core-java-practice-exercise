# Instructor Guide: Delivery and Evaluation

## Teaching strategy

Teach the topics in ascending order. Each assignment is an independent realistic micro-scenario, not a full application requiring prior phases to be completed. In lectures, connect the exercise to a larger domain (shopping, school events, cinema seating, travel, food delivery, student clubs, and daily expenses). Students can add private helpers without rewriting the public method signatures.

## Assessment design

1. **Correctness:** enable the matching JUnit test class and run it. Evaluate normal, edge and exception paths that are in the written contract.
2. **Concept fidelity:** review the code for use of the intended topic. Black-box tests cannot verify whether a student actually used a stream, a lambda, a method reference, a queue, an iterator or synchronized blocks if a different algorithm gives the same output.
3. **Maintainability:** confirm meaningful names, limited responsibilities, minimal duplication, safe exceptions and no unnecessary global state.
4. **Independent validation:** set status flag to true per assignment, retaining completed assignments as regression tests.
5. **Concurrent exercises:** run them repeatedly and inspect the thread-resource lifecycle; a single deterministic test can never prove absence of all races.
6. **JDBC:** review transaction ownership and `autoCommit` restoration, particularly when the original connection uses manual transactions. The basic test assumes auto-commit is initially true.
7. **Reflection and modules:** assess understanding of runtime metadata, encapsulation and explicit module contracts, not merely returned values.

## Important limitations

- These are teaching-oriented automated checks, not formal proofs of complete correctness.
- For P01T01 and P01T02, tooling/platform setup is covered partly by class discussion; running unit tests cannot prove an IDE was installed correctly.
- Phase 6 introduces concurrency APIs in small bounded scenarios; ask students to explain interruption, visibility and shutdown behaviors in code review.
- P07T64 additionally requires the student to create one original JUnit test; this is a manual submission check.
- Phase 7 JVM/JPMS tasks exercise real Java runtime and descriptor APIs; a separate full multi-module build can be an extension assignment.

## References

1. Apache Maven: Standard Directory Layout — https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout
2. Maven Surefire: JUnit Platform — https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
3. Java 21 release notes — https://www.oracle.com/java/technologies/javase/21-relnote-issues.html

## Using the new assignment format

Each `exercises/phaseXX/.../README.md` now includes six numbered sections. Give students only the scenario, requirements, student task, and example first; they should use JUnit to self-check after attempting the implementation. Public method signatures form an API contract, so require students to keep them stable. Examples are illustrations, not exhaustive test cases.

**Teaching note:** In P04T32 the starter method is now `serviceOrder`, and in P05T39 the applicant score field is `testScore` (replacing more specialized names from the earlier draft). These are synchronized with their test files. For P07T55 the API name `sumInvoiceLines` is intentionally retained for backward compatibility even though the simpler narrative uses personal expense lines.

### Scoring rubric (optional)

- 60% correctness against explicitly stated requirements and edge cases
- 20% demonstrating the phase's target Java concept
- 10% readability and decomposition
- 10% correct handling of invalid inputs and resource lifecycle, where relevant
