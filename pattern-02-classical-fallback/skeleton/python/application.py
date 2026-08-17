"""
Educational demonstration.
"""

from request import OptimizationRequest
from quantum_solver import QuantumSolver
from classical_solver import ClassicalSolver
from fallback_solver import FallbackSolver


solver = FallbackSolver(
    QuantumSolver(),
    ClassicalSolver()
)

result = solver.solve(
    OptimizationRequest("Route-101")
)

print(result.solver_name)