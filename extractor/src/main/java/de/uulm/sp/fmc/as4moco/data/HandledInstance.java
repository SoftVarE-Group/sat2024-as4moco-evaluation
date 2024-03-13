package de.uulm.sp.fmc.as4moco.data;



import de.uulm.sp.fmc.as4moco.extraction.FeatureVector;

import java.util.List;

public record HandledInstance(List<SolverRunInstance> solverResponses,
                              FeatureVector featureVector, double duration_AutoFolio
) implements PipelineCompletion {
}
