# Pattern #02 – Classical Fallback

# Skeleton Overview

This skeleton demonstrates how enterprise applications can continue operating when the preferred optimization engine is unavailable.

The focus is architectural resilience rather than optimization algorithms.

The business layer interacts with a single abstraction and never decides whether the preferred or fallback implementation should execute.

---

# Responsibilities

## Business Service

Requests an optimization.

It does not know:

- which solver executes
- whether a failure occurred
- whether fallback was required

---

## Solver Adapter

Provides a technology-independent interface.

Business code depends only on this abstraction.

---

## Fallback Solver

Coordinates execution.

Responsibilities:

- Invoke the preferred solver
- Detect execution failure
- Execute the classical fallback
- Return a valid result

---

## Preferred Solver

Represents the primary optimization engine.

Examples:

- Quantum service
- AI optimizer
- Remote optimization API

This component may fail.

---

## Classical Solver

Provides a reliable implementation that can always execute locally.

Although the result may be less optimal, it ensures business continuity.

---

## Solution

Represents a technology-neutral optimization result.

Business services consume only this object.

---

# Design Principles

This skeleton intentionally demonstrates:

- Separation of concerns
- Dependency inversion
- Graceful degradation
- Replaceable implementations
- Framework independence

No framework annotations or infrastructure code are included.

The objective is to teach the architecture rather than a specific implementation.

---

# Typical Execution Flow

Business Service

↓

Fallback Solver

↓

Preferred Solver

↓

Failure?

↓

Yes

↓

Classical Solver

↓

Solution

---

