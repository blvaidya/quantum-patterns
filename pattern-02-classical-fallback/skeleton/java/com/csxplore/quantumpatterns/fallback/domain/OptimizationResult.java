/*
 * Repository : Enterprise Quantum Patterns
 * Pattern    : #02 Classical Fallback
 */

package com.csxplore.quantumpatterns.fallback.domain;

/**
 * Technology-neutral optimization result.
 */
public class OptimizationResult {

    private final String solverName;

    public OptimizationResult(String solverName) {
        this.solverName = solverName;
    }

    public String solverName() {
        return solverName;
    }
}