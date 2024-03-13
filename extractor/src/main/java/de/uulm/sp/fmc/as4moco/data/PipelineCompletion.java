package de.uulm.sp.fmc.as4moco.data;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "pipelineName"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = HandledSet.class, name = "PER_SET"),
        @JsonSubTypes.Type(value = HandledInstance.class, name = "PER_INSTANCE")
})
public interface PipelineCompletion {

    List<SolverRunInstance> solverResponses();

}
