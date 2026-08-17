package com.csxplore.quantumpatterns.fallback.adapter;

import com.csxplore.quantumpatterns.fallback.domain.OptimizationRequest;
import com.csxplore.quantumpatterns.fallback.domain.OptimizationResult;
import com.csxplore.quantumpatterns.fallback.port.Solver;

/**
 * Preferred optimization implementation.
 *
 * This class intentionally simulates a failure.
 */
public class QuantumSolver implements Solver {

    @Override
    public OptimizationResult solve(OptimizationRequest request) {

        throw new RuntimeException("Quantum service unavailable");

    }

}