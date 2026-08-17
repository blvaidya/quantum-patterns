"""
Reliable fallback implementation.
"""

from solver import Solver
from result import OptimizationResult


class ClassicalSolver(Solver):

    def solve(self, request):
        return OptimizationResult("Classical Solver")