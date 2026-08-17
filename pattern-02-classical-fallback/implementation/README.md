# Pattern #02 – Classical Fallback

# Production Implementation Guide

The reference skeleton demonstrates the architectural responsibilities of the Classical Fallback pattern using a minimal implementation.

A production system typically extends these concepts while preserving the same separation of concerns.

---

# Production Mapping

| Skeleton Component | Typical Production Technology |
|--------------------|-------------------------------|
| Business Service | Spring Boot, Jakarta EE, Quarkus |
| Solver Adapter | Service Interface / Hexagonal Port |
| Preferred Solver | Qiskit, D-Wave, OR-Tools Service, External REST API |
| Classical Solver | OR-Tools, OptaPlanner, Custom Heuristics |
| Fallback Coordinator | Application Service |
| Configuration | YAML, Environment Variables, Configuration Server |

---

# Typical Runtime Flow

1. Business service submits an optimization request.
2. Preferred solver executes.
3. Result is returned immediately if successful.
4. If execution fails, the fallback coordinator invokes the classical implementation.
5. Business service receives a valid optimization result without knowing which solver produced it.

---

# Operational Considerations

A production implementation should include:

- Timeout policies
- Retry policies (optional)
- Circuit breaker integration
- Health monitoring
- Metrics collection
- Structured logging
- Distributed tracing
- Failure alerts

The fallback mechanism should remain transparent to business logic while providing full operational visibility.

---

# Extension Points

The architecture can be extended with additional capabilities such as:

- Multiple fallback levels
- Runtime solver selection
- Policy-driven routing
- Capability discovery
- Cost-aware execution
- AI-assisted solver recommendation

These extensions can be introduced without changing business services because they depend only on the Solver Adapter.

---

# Production Considerations

Fallback execution should not become the normal execution path.

Operational dashboards should track:

- Preferred solver success rate
- Fallback frequency
- Average execution time
- Failure categories
- Recovery success rate

Frequent fallback activation usually indicates infrastructure or algorithmic issues requiring investigation.

---

# Relationship to Other Patterns

Pattern #01 introduced technology independence through the Solver Adapter.

Pattern #02 introduces resilience through automatic recovery.

Pattern #03 will determine which solver should be selected before execution begins.