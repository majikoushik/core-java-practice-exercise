# P07T56 · NIO.2: Finding CSV Files in a Downloads Folder

**Phase 7: Advanced Core Java and Tooling**  
**Exercise ID:** `P07T56`  
**Starter class:** `edu.practice.corejava.phase07.t56_nio.P07T56Exercise`  
**Validation class:** `P07T56Test`

**Primary topic:** NIO.2  
**Recommended order:** follow the numeric exercise IDs, starting at P01T01.  
**Expected effort:** approximately 20–45 minutes for introductory tasks; longer for concurrency and JDBC.

## 1. Scenario — understand the problem

A school administrator exports attendance sheets into a download folder. The import tool must find only CSV files at the top level, ignoring text notes and other folders.

## 2. Requirements — what the program must do

1. Look only at regular files directly inside the given folder.
2. Accept names ending in lowercase `.csv` only.
3. Ignore directories, nested files, and other extensions.
4. Return matching `Path` objects sorted alphabetically by filename.
5. An empty folder returns an empty list.

## 3. Student task — what to submit

Complete `csvFilesInInbox(Path inbox)`. The caller already provides an existing directory; return files matching the import rule. The actual file contents do not need to be read.

**Starter template:** the Java class named above already contains the required method declarations and enough boilerplate to compile. Complete only the unfinished behavior. You may add private helpers or additional types inside this exercise package, but keep the public API unchanged.

## 4. Example — expected behavior

Files `a.csv`, `b.csv`, `notes.txt`, and nested `backup/old.csv` produce `[a.csv, b.csv]`.

The example illustrates the contract; your program must also satisfy the other specified input combinations and edge cases.

## 5. Why it matters in real projects

Folder scanning and path handling are essential for importers and scheduled file processing.

## 6. Validate your work

From the project root, run this exercise’s test without enabling any other unfinished exercises:

```bash
mvn -Dtest=P07T56Test -Dexercise.run=P07T56 test
```

When all tests pass, mark your progress using `python tools/progress.py start P07T56`, then run `mvn test` to check all activated exercises together.

**Completion:** your solution compiles, its activated JUnit tests pass, and you can explain how your implementation meets the requirements. Passing tests alone does not replace instructor review of the Java concept being practiced.
