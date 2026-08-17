# Architecture Decision Record

# Pattern #02 – Classical Fallback

## Context

Optimization engines may fail because of infrastructure issues, cloud connectivity, unsupported workloads, or algorithmic limitations.

Enterprise applications should continue operating whenever possible.

## Decision

Introduce a Classical Fallback component that automatically executes a trusted classical implementation whenever the preferred solver fails.

Business services interact only with the Solver Adapter and remain unaware of fallback execution.

## Alternatives Considered

### 1. Fail Immediately

Pros

- Simple implementation

Cons

- Poor resilience
- Interrupts business processes

---

### 2. Retry Preferred Solver

Pros

- May recover transient failures

Cons

- Increased latency
- Does not solve persistent failures

---

### 3. Classical Fallback (Selected)

Pros

- High availability
- Predictable recovery
- Minimal impact on business logic
- Supports progressive quantum adoption

Cons

- Additional orchestration
- Different optimization quality may occur

## Consequences

Positive

- Increased reliability
- Better operational resilience
- Transparent recovery
- Future-proof architecture

Negative

- Requires testing of fallback paths
- Requires governance of fallback policies

## Related Patterns

- Pattern #01 – Solver Adapter
- Pattern #03 – Solver Selection Strategy