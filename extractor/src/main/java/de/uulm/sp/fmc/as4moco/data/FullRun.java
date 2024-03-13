package de.uulm.sp.fmc.as4moco.data;

import java.io.File;
import java.time.Instant;
import java.util.List;

public record FullRun(File cnfFile, Instant start, Instant end, double duration, List<PipelineCompletion> pipelines, SolverRunInstance bestResponse) {
}
