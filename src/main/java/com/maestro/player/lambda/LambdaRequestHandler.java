package com.maestro.player.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.maestro.player.move.MoveSolverFactory;

public class LambdaRequestHandler
        implements RequestHandler<InputModel, OutputModel> {

    public OutputModel handleRequest(InputModel input, Context context) {
        context.getLogger().log("Input: " + input);
        MoveSolverFactory moveSolverFactory = new MoveSolverFactory();
        return new OutputModel(moveSolverFactory.createMoveResolver(input.getNumberOfPieces(), input.getLastMove()).solveMove());

    }
}