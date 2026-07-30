/*
 * ============================================================================
 * Enterprise Quantum Patterns
 * Pattern #01 - Solver Adapter
 * ============================================================================
 *
 * File:
 *     SolverAdapter.java
 *
 * Purpose:
 *     Defines the contract between the business layer and an optimization
 *     engine.
 *
 * Pattern Intent:
 *     Business services should depend only on this interface instead of a
 *     specific optimization technology (Classical, Quantum, AI, etc.).
 *
 * Why it matters:
 *     Enterprise applications typically evolve over many years. During that
 *     time, optimization technologies may change multiple times.
 *
 *     By introducing a stable abstraction, business services remain unchanged
 *     while implementations evolve independently.
 *
 * Typical Implementations:
 *     • Classical Solver
 *     • Quantum Solver
 *     • AI-assisted Optimizer
 *     • Cloud Optimization Service
 *
 * This file intentionally demonstrates architectural responsibility rather
 * than production implementation.
 * ============================================================================
 */

package com.csxplore.quantumpatterns.solveradapter;

/**
 * Stable contract between enterprise business services and optimization
 * engines.
 *
 * <p>Business services communicate exclusively through this interface.
 * Concrete implementations translate requests into engine-specific APIs and
 * normalize responses before returning them to the business layer.</p>
 *
 * <p>The business layer should never know which optimization technology is
 * currently executing the request.</p>
 */
public interface SolverAdapter {

    /**
     * Executes an optimization request.
     *
     * @param request Standardized optimization request.
     * @return Standardized optimization result.
     */
    OptimizationResult optimize(OptimizationRequest request);

}