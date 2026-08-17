package com.csxplore.quantumpatterns.fallback;

import com.csxplore.quantumpatterns.fallback.adapter.ClassicalSolver;
import com.csxplore.quantumpatterns.fallback.adapter.FallbackSolver;
import com.csxplore.quantumpatterns.fallback.adapter.QuantumSolver;
import com.csxplore.quantumpatterns.fallback.port.Solver;
import com.csxplore.quantumpatterns.fallback.service.OptimizationService;

/**
 * Demonstrates automatic fallback execution.
 */
public class Application {

    public static void main(String[] args) {

        Solver solver =
                new FallbackSolver(
                        new QuantumSolver(),
                        new ClassicalSolver());

        OptimizationService service =
                new OptimizationService(solver);

        System.out.println(
                service.optimize("Route-101").solverName());

    }

}