# P05T39 · Functional Interfaces: Scholarship Shortlisting

**Phase 5: Modern Java and Functional Programming**  
**Exercise ID:** `P05T39`  
**Starter class:** `edu.practice.corejava.phase05.t39_functional_interfaces.P05T39Exercise`  
**Validation class:** `P05T39Test`

**Primary topic:** Functional Interfaces  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A college runs several student-support programs. One program accepts students scoring at least 70, while another uses a different rule. The shortlist service should accept the rule as an input rather than be rewritten for every program.

## 2. Requirements — what the program must do

1. Receive applicants and a supplied `EligibilityRule`.
2. Return only applicants accepted by that rule.
3. Preserve the original relative order of accepted applicants.
4. Do not alter the incoming list.
5. The scoring rule is chosen by the caller, not fixed inside the filtering method.

## 3. Student task — what to submit

Complete `eligibleApplicants(List<Applicant> applicants, EligibilityRule rule)`. Each applicant has a name and `testScore`. Make the filtering workflow apply whatever eligibility rule is passed to it.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

For scores `71` and `58`, a rule requiring `>= 70` selects only the first applicant; a rule accepting everyone selects both.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Callbacks let one reusable workflow support different rules, campaigns, and configuration.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P05T39Test -Dexercise.run=P05T39 test
```

When all tests pass, mark your progress using `python tools/progress.py start P05T39`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
