package com.csxplore.quantumpatterns.fallback.adapter;

import com.csxplore.quantumpatterns.fallback.domain.OptimizationRequest;
import com.csxplore.quantumpatterns.fallback.domain.OptimizationResult;
import com.csxplore.quantumpatterns.fallback.port.Solver;

/**
 * Reliable local implementation.
 *
 * Used whenever the preferred solver cannot complete.
 */
public class ClassicalSolver implements Solver {

    @Override
    public OptimizationResult solve(OptimizationRequest request) {

        return new OptimizationResult("Classical Solver");

    }

}