package de.uulm.sp.fmc.as4moco.extraction;

import org.collection.fm.handler.FeatureStatus;

import java.util.Map;

public record FeatureVector(String vector, Map<String, Double> runtime, Map<String, FeatureStatus> status) {

}
