# Pattern #01 – Solver Adapter Reference Skeleton

This directory contains the **reference skeleton** for the **Solver Adapter** pattern.

The goal of the skeleton is to explain the responsibilities of each component without introducing framework-specific implementation details.

Unlike the production implementation, the skeleton intentionally omits networking, dependency injection, persistence, logging, security, and error handling so the architectural pattern remains the primary focus.

---

## Purpose

The Solver Adapter pattern separates business logic from optimization technologies.

Instead of calling a classical or quantum solver directly, business services depend on a common interface.

```
Business Service
        │
        ▼
 SolverAdapter
        │
 ┌──────┴──────┐
 ▼             ▼
Classical   Quantum
 Solver      Solver
```

The business layer never needs to know which implementation is currently being used.

---

## Directory Structure

```
skeleton/

├── README.md
│
├── java/
│   ├── SolverAdapter.java
│   ├── RouteOptimizationService.java
│   ├── OptimizationRequest.java
│   └── OptimizationResult.java
│
├── python/
│   ├── classical_solver.py
│   └── quantum_solver.py
│
├── docker/
│   └── docker-compose.yml
│
└── config/
    └── application.yml
```

---

## Java Components

### SolverAdapter

Defines the abstraction used by the business layer.

This is the only interface the business service should depend on.

---

### RouteOptimizationService

Represents enterprise business logic.

Its responsibility is to prepare an optimization request and process the returned result.

It never communicates directly with a solver implementation.

---

### OptimizationRequest

Represents the information required by an optimization engine.

The request model should remain independent of vendor-specific APIs whenever possible.

---

### OptimizationResult

Represents the standardized response returned to the business layer.

Different optimization engines should produce results that can be mapped into this common model.

---

## Python Components

Two reference services are provided.

**classical_solver.py**

Represents a traditional optimization engine.

**quantum_solver.py**

Represents a quantum optimization engine.

Both expose the same logical contract.

---

## Docker

The Docker skeleton illustrates how services can be composed for local development.

Containerization is included only to demonstrate deployment topology.

---

## Configuration

The configuration skeleton demonstrates how an application can switch implementations through configuration rather than source code changes.

Typical examples include:

- Spring Profiles
- Feature Flags
- Environment Variables

---

## What This Skeleton Does Not Include

To keep the pattern focused, the following concerns are intentionally excluded:

- Authentication
- Authorization
- Logging
- Metrics
- Distributed tracing
- Retry logic
- Timeouts
- Persistence
- Production deployment

These belong in a production implementation rather than an architectural pattern.

---

## Learning Objectives

After reviewing this skeleton, you should understand:

- Why an adapter improves maintainability.
- How business services remain independent of optimization technologies.
- How classical and quantum implementations can coexist.
- Why configuration is preferable to source code changes when selecting implementations.

---

## Next Step

Continue with the Java reference skeletons.

Each Java file explains one architectural responsibility of the pattern while remaining intentionally framework-independent.