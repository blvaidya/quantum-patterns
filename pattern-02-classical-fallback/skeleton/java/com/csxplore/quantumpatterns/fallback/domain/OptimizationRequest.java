/*
 * Repository : Enterprise Quantum Patterns
 * Pattern    : #02 Classical Fallback
 * Purpose    : Represents an optimization request.
 */

package com.csxplore.quantumpatterns.fallback.domain;

/**
 * Immutable business request.
 *
 * Framework independent.
 */
public class OptimizationRequest {

    private final String problemId;

    public OptimizationRequest(String problemId) {
        this.problemId = problemId;
    }

    public String problemId() {
        return problemId;
    }
}