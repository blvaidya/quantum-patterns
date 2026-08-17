"""
Preferred optimization engine.

This example intentionally fails.
"""

from solver import Solver


class QuantumSolver(Solver):

    def solve(self, request):
        raise RuntimeError("Quantum solver unavailable")