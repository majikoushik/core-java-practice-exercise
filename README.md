# Core Java — Everyday Scenario Labs

**7 phases · 65 topics · 65 approachable everyday exercises · independent JUnit validation.**

Every exercise now has a **full scenario**, **numbered functional requirements**, an explicit **student task**, a **concrete input/output example**, and **real-project relevance**. No specialist science, chemistry, or research knowledge is needed. All student starter templates remain unfinished by design.

## Requirements

- **JDK 21+** installed (Java 21 used as the language/API baseline)
- Apache Maven 3.9+ (or a recent Maven 3.x release)
- IntelliJ IDEA or another Java IDE
- Internet access during the first Maven build to download JUnit and H2 dependencies

No solution code is included in the student starter classes. Each class has compile-safe `UnsupportedOperationException` placeholders; replacing those placeholders is the student task.

## Start here (in this order)

1. Import this folder as a **Maven project** in IntelliJ IDEA; select **JDK 21** (or a newer JDK).
2. Run `mvn clean verify`. The project should compile **without student solutions**. The 65 topic test suites are **skipped** until activated; the project-health test runs.
3. Browse the [Scenario Catalog](docs/SCENARIO_CATALOG.md), then read the [Topic Index](docs/TOPIC_INDEX.md), then open [P01T01](exercises/phase01/P01T01_java-platform/README.md).
4. Open the `src/main/java` starter class named in that exercise's README. Implement only its required behavior (you may add private methods or supporting classes in that topic package).
5. Run only that exercise's validation, without editing the progress file:

   ```bash
   mvn -Dtest=P01T01Test -Dexercise.run=P01T01 test
   ```

6. When ready, mark `P01T01=true` in `src/test/resources/exercise-progress.properties`. The next `mvn test` will enforce tests for every activated exercise.
7. Proceed to P01T02, then continue in numeric order. Use the [checklist](docs/PROGRESS_CHECKLIST.md).

### Key distinction: build success is not exercise completion

`mvn clean verify` succeeds on the pristine starter project **because unfinished exercise tests are deliberately skipped**. It proves that starter templates compile, not that students have solved the problems. The topic is validated only when its test is activated or forced to run, and all assertions pass.

## Folder layout

```text
core-java-everyday-scenario-labs/
├── pom.xml
├── README.md
├── docs/
│   ├── SCENARIO_CATALOG.md
│   ├── TOPIC_INDEX.md
│   ├── PROGRESS_CHECKLIST.md
│   └── INSTRUCTOR_GUIDE.md
├── exercises/
│   ├── phase01/        # 9 topics, P01T01–P01T09
│   ├── phase02/        # 11 topics, P02T10–P02T20
│   ├── phase03/        # 8 topics, P03T21–P03T28
│   ├── phase04/        # 10 topics, P04T29–P04T38
│   ├── phase05/        # 8 topics, P05T39–P05T46
│   ├── phase06/        # 8 topics, P06T47–P06T54
│   └── phase07/        # 11 topics, P07T55–P07T65
├── src/
│   ├── main/java/edu/practice/corejava/
│   │   ├── phase01/ ... phase07/   # One topic-specific package per exercise
│   │   └── shared/
│   └── test/
│       ├── java/edu/practice/corejava/ # Corresponding JUnit tests
│       └── resources/exercise-progress.properties
└── tools/progress.py
```

Each topic has exactly one student-facing assignment README, one Java starter class, and one independent JUnit test class. Open the assignment README first; the code skeleton deliberately omits implementation hints. Several topics contain two operations when the syllabus naturally requires them. Student code is kept isolated by topic to prevent one unfinished exercise from breaking another's compilation.

## Validation commands

| Purpose | Command |
|---|---|
| Compile all starters and run enabled tests | `mvn clean verify` |
| Validate **one** topic immediately | `mvn -Dtest=P01T01Test -Dexercise.run=P01T01 test` |
| Enable a topic permanently for your local working copy | Change `P01T01=false` to `P01T01=true` in `src/test/resources/exercise-progress.properties` |
| Validate every currently enabled topic | `mvn test` |
| Force all 65 suites (expected to fail until fully implemented) | `mvn -Dexercise.run=ALL test` |
| Show student progress | `python tools/progress.py list` |
| Activate a topic from terminal | `python tools/progress.py start P01T01` |
| Deactivate a topic from terminal | `python tools/progress.py pause P01T01` |

On Windows PowerShell, quote Maven `-D` arguments if your shell modifies them (for example, `mvn '-Dtest=P01T01Test' '-Dexercise.run=P01T01' test`). In IntelliJ, the test class can also be run directly after the progress flag is set to true.

## Exercise specification policy

- Every exercise provides a **plain-language scenario, numbered requirements, a student task, illustrative example, and real-project relevance**.
- Starter Java includes necessary type signatures and minimal boilerplate **but no hints, algorithms, or solutions**.
- JUnit tests provide executable **behavioral verification**; testing files are intentionally separate from assignment files.
- More sophisticated topics (concurrency, JDBC, modules) test a focused, practical contract and are subject to instructor review for design choices not testable by output assertions alone.
- Native Java serialization (P07T57) is for **trusted bytes only**; never deserialize arbitrary external data.

## Curriculum overview

| Phase | Focus | Exercises |
|---|---|---:|
| 1 | Java Fundamentals | 9 |
| 2 | Object-Oriented Programming | 11 |
| 3 | Essential Java APIs | 8 |
| 4 | Collections and Generics | 10 |
| 5 | Modern Java and Functional Programming | 8 |
| 6 | Multithreading and Concurrency | 8 |
| 7 | Advanced Core Java and Tooling | 11 |
| **Total** | **65 topic packages, each with independent validation** | **65** |

## Technical notes

JUnit Jupiter tests use Maven Surefire; the database test uses H2 entirely in memory. The project has no mandatory production runtime dependencies. Maven and Java versions are intentionally pinned for reproducibility, except that the installed JDK may be newer than 21.

### Reference documentation

- Maven standard layout: https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout
- JUnit Platform with Surefire: https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
- Java 21 release notes: https://www.oracle.com/java/technologies/javase/21-relnote-issues.html
