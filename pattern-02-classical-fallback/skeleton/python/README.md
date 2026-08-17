# Python Reference Skeleton

This directory illustrates a Python implementation of the Classical Fallback pattern.

The objective is not to provide a production-ready optimizer, but to demonstrate the architectural responsibilities of each component.

The Python implementation mirrors the Java reference skeleton.

Business code remains independent of the optimization technology and communicates only through a common solver interface.

The preferred solver intentionally raises an exception to demonstrate how the fallback implementation preserves business continuity.

Future production implementations may replace these educational classes with:

- Qiskit
- D-Wave
- OR-Tools
- Pyomo
- AI-assisted optimizers

without changing the surrounding architecture.