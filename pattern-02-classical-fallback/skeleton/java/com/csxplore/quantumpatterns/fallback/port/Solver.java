package com.csxplore.quantumpatterns.fallback.port;

import com.csxplore.quantumpatterns.fallback.domain.OptimizationRequest;
import com.csxplore.quantumpatterns.fallback.domain.OptimizationResult;

/**
 * Technology-independent optimization interface.
 *
 * Every optimization engine implements this contract.
 */
public interface Solver {

    OptimizationResult solve(OptimizationRequest request);

}