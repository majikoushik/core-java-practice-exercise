# Release Notes — Everyday Scenario Labs v1.1

This package updates the earlier 65-topic Core Java exercise repository.

- Retained the seven learning phases, numbered exercise packages, and independent JUnit tests.
- Rewrote all 65 student assignment READMEs with a real-world scenario, numbered requirements, a student task, expected-behavior example, and practical relevance.
- Updated every Java starter class description to match its assignment.
- Replaced laboratory equipment with sports-club borrowing, specialist credit-scoring with scholarship shortlisting, and hospital scheduling with customer-service priority.
- Updated fixture names and corresponding tests where scenario APIs changed.
- Added `docs/SCENARIO_CATALOG.md` and refreshed the topic index, project overview, and instructor guide.
- Retained default compile-safe placeholders and opt-in tests.

## Intentional changes in two public starter APIs

- P04T32 `treatmentOrder(...)` → `serviceOrder(...)`
- P05T39 `Applicant.creditScore()` → `Applicant.testScore()`

The tests in this release use the revised APIs. Students should download and work from this version as a whole rather than mixing individual files from the older release.

## Verification performed

- Java 21 compiler successfully compiled all 65 starter classes.
- All Java test source files were independently syntax-checked using temporary JUnit signature stubs outside this repository.
- All 65 assignment READMEs, 65 starter classes, 65 test classes, and disabled initial progress flags were checked.
- A complete Maven test execution was not possible in the build environment (Maven and dependencies were unavailable). Running `mvn clean verify` after import is the required final environment check.
