# Fallback Policy

The preferred optimization engine should always execute first.

Fallback should occur only when:

- The preferred solver is unavailable.
- The solver exceeds timeout limits.
- The solver reports an unrecoverable execution failure.
- The requested optimization is unsupported.

Fallback should be transparent to business services.

Business components should never select the fallback implementation directly.

Operational monitoring should record:

- Preferred solver usage
- Fallback activations
- Failure reasons
- Recovery success rate