package com.csxplore.quantumpatterns.fallback.adapter;

import com.csxplore.quantumpatterns.fallback.domain.OptimizationRequest;
import com.csxplore.quantumpatterns.fallback.domain.OptimizationResult;
import com.csxplore.quantumpatterns.fallback.port.Solver;

/**
 * Coordinates fallback behaviour.
 *
 * Business services interact only with this component.
 */
public class FallbackSolver implements Solver {

    private final Solver preferredSolver;
    private final Solver fallbackSolver;

    public FallbackSolver(
            Solver preferredSolver,
            Solver fallbackSolver) {

        this.preferredSolver = preferredSolver;
        this.fallbackSolver = fallbackSolver;
    }

    @Override
    public OptimizationResult solve(
            OptimizationRequest request) {

        try {

            return preferredSolver.solve(request);

        } catch (RuntimeException ex) {

            return fallbackSolver.solve(request);

        }

    }

}