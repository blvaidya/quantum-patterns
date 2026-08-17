/*
 * ============================================================================
 * Enterprise Quantum Patterns
 * Pattern #01 - Solver Adapter
 * ============================================================================
 *
 * File:
 *     OptimizationResult.java
 *
 * Purpose:
 *     Represents a standardized response returned from an optimization engine.
 *
 * Design Goal:
 *     Business services should receive a consistent response regardless of the
 *     underlying implementation.
 *
 * Example implementations may include:
 *
 *     • Classical Solver
 *     • Quantum Solver
 *     • AI Planner
 *     • Future optimization technologies
 *
 * The adapter is responsible for converting implementation-specific responses
 * into this common representation.
 * ============================================================================
 */

package com.csxplore.quantumpatterns.solveradapter;

/**
 * Standard optimization result.
 *
 * <p>This class intentionally exposes only a minimal set of fields to
 * illustrate the pattern.</p>
 */
public class OptimizationResult {

    /**
     * Name of the optimization engine that produced the result.
     */
    private String engine;

    /**
     * Indicates whether optimization completed successfully.
     */
    private boolean successful;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

}