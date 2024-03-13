package de.uulm.sp.fmc.as4moco.solver;

import java.util.Optional;

public record SolverResponse(Optional<String> solver, SolverStatusEnum status, Optional<Double> solution) {

    @Override
    public String toString() {
        return "SolverResponse{" +
                "solver=" + solver +
                ", status=" + status +
                ", solution=" + solution +
                '}';
    }
}
