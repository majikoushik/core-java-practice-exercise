#!/usr/bin/env python3
"""Toggle and list exercise-test activation flags. Python 3.9+; no dependencies."""
from pathlib import Path
import sys

ROOT = Path(__file__).resolve().parents[1]
STATUS = ROOT / "src/test/resources/exercise-progress.properties"

def main():
    lines = STATUS.read_text(encoding="utf-8").splitlines()
    pairs = {line.split("=", 1)[0]: line.split("=", 1)[1]
             for line in lines if line.startswith("P") and "=" in line}
    if len(sys.argv) == 2 and sys.argv[1] == "list":
        for key, value in pairs.items():
            print(f"{key}: {'READY FOR VALIDATION' if value == 'true' else 'NOT STARTED'}")
        print(f"Activated: {sum(v == 'true' for v in pairs.values())} / {len(pairs)}")
        return 0
    if len(sys.argv) != 3 or sys.argv[1] not in ("start", "pause"):
        print("Usage: python tools/progress.py list | start P01T01 | pause P01T01")
        return 2
    action, topic = sys.argv[1], sys.argv[2].upper()
    if topic not in pairs:
        print(f"Unknown exercise: {topic}")
        return 2
    replacement = "true" if action == "start" else "false"
    updated = [f"{topic}={replacement}" if line.startswith(topic + "=") else line
               for line in lines]
    STATUS.write_text("\n".join(updated) + "\n", encoding="utf-8")
    print(f"{topic} set to {replacement}. Next: mvn -Dtest={topic}Test test")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
