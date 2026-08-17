"""
Coordinates fallback execution.
"""

from solver import Solver


class FallbackSolver(Solver):

    def __init__(self, preferred, fallback):
        self.preferred = preferred
        self.fallback = fallback

    def solve(self, request):

        try:
            return self.preferred.solve(request)

        except RuntimeError:
            return self.fallback.solve(request)