/*
 * ============================================================================
 * Enterprise Quantum Patterns
 * Pattern #01 - Solver Adapter
 * ============================================================================
 *
 * File:
 *     OptimizationRequest.java
 *
 * Purpose:
 *     Represents a technology-neutral optimization request.
 *
 * Design Goal:
 *     Avoid exposing vendor-specific request models to business services.
 *
 * Production examples:
 *
 *     • Delivery locations
 *     • Warehouse capacities
 *     • Customer demand
 *     • Resource constraints
 *     • Scheduling requirements
 *
 * Adapter implementations translate this model into the format required by
 * the underlying optimization engine.
 * ============================================================================
 */

package com.csxplore.quantumpatterns.solveradapter;

/**
 * Standard optimization request.
 *
 * <p>The structure is intentionally simplified because this repository focuses
 * on architecture rather than implementation details.</p>
 */
public class OptimizationRequest {

    /**
     * Human-readable name of the optimization problem.
     */
    private String problemName;

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

}