# Pattern #01 – Solver Adapter

> **Enterprise Quantum Patterns**  
> Reusable architecture patterns for building hybrid classical–quantum enterprise applications.

---

## Pattern Summary

The **Solver Adapter** pattern decouples enterprise business logic from optimization engine implementations by introducing a stable abstraction layer. Instead of invoking a specific optimization technology directly, application services communicate through a common adapter interface.

This allows optimization engines to evolve independently from business services while preserving a stable application programming model.

Although this pattern is demonstrated using classical and quantum optimization engines, the underlying design is technology independent and applies equally to machine learning inference engines, rule engines, GPU accelerators, cloud services, and future computational platforms.

---

## Intent

Provide a stable interface between enterprise applications and optimization engines so that business logic remains independent of implementation-specific technologies.

---

## Motivation

Enterprise software often evolves over many years.

During its lifetime an optimization engine may change several times.

For example:

- Initial implementation using an in-memory heuristic
- Migration to Google OR-Tools
- Migration to Qiskit Optimization
- Integration with a cloud quantum provider
- Future replacement with another optimization engine

If business services invoke these implementations directly, every migration requires widespread application changes.

The Solver Adapter pattern isolates these implementation details behind a stable interface.

---

## Problem Statement

Without an abstraction layer, business services become tightly coupled to specific optimization technologies.

Typical symptoms include:

- Direct REST calls throughout the application
- Vendor-specific request models
- Vendor-specific response models
- Difficult unit testing
- Complex migrations
- Repeated implementation logic

As optimization technologies evolve, technical debt increases.

---

## Context

This pattern applies whenever an enterprise application delegates optimization or decision-making to an external engine.

Typical examples include:

- Route optimization
- Supply chain optimization
- Workforce scheduling
- Manufacturing planning
- Portfolio optimization
- Resource allocation

The optimization engine may be:

- Classical
- Quantum
- Hybrid classical–quantum
- AI-assisted
- Cloud-hosted

---

## Architecture Overview

```
                 Business Service
                         │
                         ▼
                Solver Adapter Interface
                         │
          ┌──────────────┴──────────────┐
          ▼                             ▼
 Classical Solver Adapter     Quantum Solver Adapter
          │                             │
          ▼                             ▼
 Classical Engine             Quantum Engine
```

---

## Participants

### Business Service

Owns business rules.

Never depends on a specific optimization technology.

---

### Solver Adapter

Defines the stable contract used by the business layer.

---

### Classical Solver

Delegates requests to a classical optimization engine.

---

### Quantum Solver

Delegates requests to a quantum optimization engine.

---

### Optimization Engine

Performs the actual optimization.

This repository intentionally treats the engine as an implementation detail.

---

## Request Flow

1. Business service creates an optimization request.
2. Request is sent to the Solver Adapter.
3. Adapter delegates to the configured implementation.
4. Optimization engine performs computation.
5. Standardized response is returned.
6. Business service processes results.

---

## Benefits

- Decouples business logic
- Supports dependency injection
- Enables technology migration
- Simplifies testing
- Reduces vendor lock-in
- Encourages interface-first design
- Improves maintainability
- Supports incremental quantum adoption

---

## Trade-offs

Introducing an abstraction layer increases architectural complexity.

Small applications with a single optimization engine may not require this level of indirection.

However, enterprise systems generally benefit from the flexibility gained through abstraction.

---

## When to Use

Use this pattern when:

- Multiple optimization engines may exist
- Technology evolution is expected
- Vendor independence is important
- Business services should remain stable
- Long-term maintainability is a priority

---

## When NOT to Use

Avoid this pattern when:

- The optimization implementation is trivial
- The application has a short expected lifetime
- Only a single implementation will ever exist
- Additional abstraction provides no measurable value

---

## Related Design Patterns

- Adapter
- Strategy
- Factory
- Dependency Injection
- Facade

---

## Enterprise Examples

- Logistics optimization
- Manufacturing planning
- Vehicle routing
- Financial portfolio optimization
- Workforce scheduling
- Capacity planning

---

## Repository Structure

```
pattern-01-solver-adapter/

├── README.md
├── DECISIONS.md
├── CHANGELOG.md
│
├── docs/
│   ├── architecture.png
│   ├── architecture.drawio
│   └── sequence.png
│
├── skeleton/
│   ├── README.md
│   ├── java/
│   ├── python/
│   ├── docker/
│   └── config/
│
└── implementation/
    └── README.md
```

---

## Skeleton Philosophy

The source code contained within the `skeleton` directory is intentionally incomplete.

It is designed to explain architectural responsibilities rather than provide a production implementation.

Each source file contains detailed documentation describing:

- Design intent
- Responsibilities
- Extension points
- Production considerations
- Relationship to other patterns

---

## Production Implementation

This repository focuses on architecture patterns.

Production-ready implementations are documented separately within the Enterprise Quantum Platform project.

---

## Next Pattern

**Pattern #02 – Classical Fallback**

Introduce graceful degradation when quantum optimization is unavailable.