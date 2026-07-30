/*
 * ============================================================================
 * Enterprise Quantum Patterns
 * Pattern #01 - Solver Adapter
 * ============================================================================
 *
 * File:
 *     RouteOptimizationService.java
 *
 * Purpose:
 *     Represents enterprise business logic.
 *
 * Responsibility:
 *     Prepare optimization requests.
 *     Delegate execution to the SolverAdapter.
 *     Consume standardized results.
 *
 * Important:
 *     This service intentionally has no knowledge of:
 *
 *         - Classical algorithms
 *         - Quantum algorithms
 *         - REST APIs
 *         - Qiskit
 *         - OR-Tools
 *         - Vendor SDKs
 *
 * Those responsibilities belong to adapter implementations.
 * ============================================================================
 */

package com.csxplore.quantumpatterns.solveradapter;

/**
 * Example business service.
 *
 * <p>This class demonstrates the primary goal of the Solver Adapter pattern:
 * business logic remains stable while optimization engines evolve.</p>
 */
public class RouteOptimizationService {

    private final SolverAdapter solverAdapter;

    /**
     * Creates a business service using the supplied adapter.
     *
     * @param solverAdapter Active optimization implementation.
     */
    public RouteOptimizationService(SolverAdapter solverAdapter) {
        this.solverAdapter = solverAdapter;
    }

    /**
     * Executes a route optimization request.
     *
     * <p>In a production application this method would:
     * <ul>
     *     <li>Validate business rules</li>
     *     <li>Create an OptimizationRequest</li>
     *     <li>Delegate to the SolverAdapter</li>
     *     <li>Interpret the returned result</li>
     * </ul>
     *
     * The important point is that this method never depends on a specific
     * optimization technology.
     *
     * @param request Standard optimization request.
     * @return Standard optimization result.
     */
    public OptimizationResult optimize(OptimizationRequest request) {
        return solverAdapter.optimize(request);
    }

}