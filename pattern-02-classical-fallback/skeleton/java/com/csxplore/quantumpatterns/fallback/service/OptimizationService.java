package com.csxplore.quantumpatterns.fallback.service;

import com.csxplore.quantumpatterns.fallback.domain.OptimizationRequest;
import com.csxplore.quantumpatterns.fallback.domain.OptimizationResult;
import com.csxplore.quantumpatterns.fallback.port.Solver;

/**
 * Business service.
 *
 * Completely unaware of fallback behaviour.
 */
public class OptimizationService {

    private final Solver solver;

    public OptimizationService(Solver solver) {
        this.solver = solver;
    }

    public OptimizationResult optimize(String id) {

        return solver.solve(
                new OptimizationRequest(id));

    }

}