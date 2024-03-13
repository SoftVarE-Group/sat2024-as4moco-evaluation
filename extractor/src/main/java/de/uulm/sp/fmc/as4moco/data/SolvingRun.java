package de.uulm.sp.fmc.as4moco.data;

import java.io.File;
import java.time.Instant;

public record SolvingRun(File cnfFile, Instant start, Instant end, double duration, SolverRunInstance solverResponse) {
}
