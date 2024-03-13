package de.uulm.sp.fmc.as4moco.solver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class SolverMap {

    private final static Map<String, SolverInterface> solvers = Map.ofEntries(
            //todo add solvers
            Map.entry("c2d/default", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/c2d/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_default";
                }

            }),
            Map.entry("d4/default.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/d4/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_default.sh";
                }

            }),
            Map.entry("dpmcpre/1pre1mp0", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/dpmcpre/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_1pre1mp0";
                }

                @Override
                public List<String> getParameters(File cnf) {
                    List<String> list = new ArrayList<>();
                    list.add(cnf.getAbsolutePath());
                    try {
                        list.add(Files.createTempDirectory("solverTemp").toFile().getAbsolutePath());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    return list;
                }
            }),
            Map.entry("dpmcpre/1pre1mp1", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/dpmcpre/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_1pre1mp1";
                }

                @Override
                public List<String> getParameters(File cnf) {
                    List<String> list = new ArrayList<>();
                    list.add(cnf.getAbsolutePath());
                    try {
                        list.add(Files.createTempDirectory("solverTemp").toFile().getAbsolutePath());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    return list;
                }
            }),
            Map.entry("gpmc/track1", new SolverInterface() { //TODO Missing Solver gpmc_r2/track1
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/gpmc/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_track1";
                }
            })
            ,Map.entry("gpmc_r2/track1", new SolverInterface() { //TODO Missing Solver gpmc_r2/track1
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/gpmc_r2/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_track1";
                }
            }),
            Map.entry("Narsimha-track1v-7112ef8eb466e9475/track1_conf1.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/Narsimha-track1v-7112ef8eb466e9475/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_track1_conf1.sh";
                }
            }),
            Map.entry("Narsimha-track1v-7112ef8eb466e9475/track1_conf2.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/Narsimha-track1v-7112ef8eb466e9475/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_track1_conf2.sh";
                }
            }),
            Map.entry("Narsimha-track1v-51fd045537919d/track1_conf1.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/Narsimha-track1v-51fd045537919d");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_track1_conf1.sh";
                }
            }),
            Map.entry("Narsimha-track1v-51fd045537919d/track1_conf2.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/Narsimha-track1v-51fd045537919d");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_track1_conf2.sh";
                }
            }),
            Map.entry("SharpSAT-TD-unweighted/default", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/SharpSAT-TD-unweighted/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_default";
                }
            }),
            Map.entry("TwG/1.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/TwG/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_1.sh";
                }
            }),
            Map.entry("TwG/2.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/TwG/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_2.sh";
                }
            }),
            Map.entry("mtmc/default", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/mtmc/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_default";
                }
            }),
            Map.entry("ExactMC/ExactMC_Arjun.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/ExactMC/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_ExactMC_Arjun.sh";
                }
            })
            ,
            Map.entry("ExactMC/ExactMC_BE.sh", new SolverInterface() {
                @Override
                public File getFolder() {
                    return new File("workingSolvers/MC2022_Solvers/Track1_MC/ExactMC/bin");
                }

                @Override
                public String getExecutable() {
                    return "starexec_run_ExactMC_BE.sh";
                }
            })
    );

    public static SolverInterface getSolver(String name){
        return solvers.get(name);
    }

    public static Optional<String> getName(SolverInterface solverInterface){
        return solvers.entrySet().stream().filter(e -> e.getValue().getExecutable().equals(solverInterface.getExecutable()) && e.getValue().getFolder().equals(solverInterface.getFolder())).map(Map.Entry::getKey).findAny();
    }

    public static List<SolverInterface> getSolvers(){
        return List.copyOf(solvers.values());
    }

    public static List<String> getNames(){
        return List.copyOf(solvers.keySet());
    }


}
