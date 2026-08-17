"""
Repository : Enterprise Quantum Patterns
Pattern    : #02 Classical Fallback

Technology-independent solver contract.
"""

from abc import ABC, abstractmethod


class Solver(ABC):

    @abstractmethod
    def solve(self, request):
        """Execute optimization."""
        pass