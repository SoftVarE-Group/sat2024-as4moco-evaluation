package de.uulm.sp.fmc.as4moco.data;



import java.util.List;

public record HandledSet(List<SolverRunInstance> solverResponses) implements PipelineCompletion {
}
