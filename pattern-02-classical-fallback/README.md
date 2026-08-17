# Enterprise Quantum Patterns

# Pattern #02 – Classical Fallback

| Field | Value |
|--------|-------|
| Pattern Number | 02 |
| Pattern Name | Classical Fallback |
| Category | Resilience |
| Difficulty | Beginner |
| Reading Time | 10–15 minutes |
| Implementation | Reference Skeleton |
| Production Ready | No |
| Prerequisites | Pattern #01 – Solver Adapter (Recommended) |
| Related Patterns | Pattern #01 – Solver Adapter |
| LinkedIn Published | No |

---

# Pattern Summary

A quantum-ready architecture should never depend on the availability of a quantum solver.

This pattern introduces a **fallback mechanism** that transparently executes a classical optimization algorithm whenever the preferred solver cannot produce a result.

The application continues operating without requiring changes from the business layer, improving reliability while preserving future extensibility.

---

# Intent

Provide resilient optimization by automatically switching to a classical implementation whenever the preferred optimization engine is unavailable or unsuitable.

---

# Problem

Enterprise applications increasingly integrate multiple optimization technologies.

Examples include:

- Classical heuristics
- AI-assisted optimization
- Quantum algorithms
- External optimization services

Any of these components may become unavailable because of:

- Network failures
- Cloud outages
- API rate limits
- Authentication failures
- Solver timeouts
- Unsupported problem sizes
- Experimental algorithm failures

Without a fallback strategy, a single solver failure can prevent business operations from completing.

---

# Solution

Introduce a fallback layer that encapsulates recovery behavior.

The application first attempts the preferred optimization engine.

If execution fails, the architecture transparently invokes a predefined classical implementation.

Business services remain unaware of which implementation ultimately solved the problem.

The Solver Adapter defined in Pattern #01 provides the abstraction, while this pattern adds resilient execution behavior.

---

# Architecture

```
Business Service
        │
        ▼
 Solver Adapter
        │
        ▼
Preferred Solver
        │
   Success?
   ┌────┴────┐
  Yes       No
   │         │
   ▼         ▼
 Result  Classical
          Fallback
             │
             ▼
          Final Result
```

---

# Benefits

- Improves system resilience
- Eliminates single points of failure
- Preserves business continuity
- Enables gradual quantum adoption
- Supports hybrid optimization environments
- Simplifies operational recovery
- Keeps business logic independent of execution strategy

---

# Trade-offs

- Additional orchestration logic
- Slight increase in execution complexity
- Potentially different optimization quality
- Fallback policies require governance
- Additional testing scenarios

---

# When to Use

Use this pattern when:

- Quantum services may be unavailable
- External optimization APIs are used
- Reliability is more important than optimality
- Multiple optimization technologies coexist
- Business processes must always complete

Typical examples include:

- Supply chain optimization
- Vehicle routing
- Workforce scheduling
- Manufacturing planning
- Financial portfolio optimization

---

# When NOT to Use

Avoid this pattern when:

- Only one deterministic algorithm exists
- Failure should immediately terminate processing
- Every optimization must use exactly one certified solver
- Regulatory requirements prohibit alternative implementations

---

# Repository Structure

```
pattern-02-classical-fallback/

├── README.md
├── DECISIONS.md
├── CHANGELOG.md
│
├── docs/
├── skeleton/
└── implementation/
```

---

# Relationship to Pattern #01

Pattern #01 introduced the **Solver Adapter**, which decouples business logic from optimization technologies.

Pattern #02 builds upon that abstraction by introducing automatic recovery through a classical implementation.

The adapter remains unchanged.

Only execution behavior becomes more resilient.

---

# Next Pattern

Pattern #03 – Solver Selection Strategy

Demonstrates how runtime policies determine the most appropriate optimization engine before execution begins.