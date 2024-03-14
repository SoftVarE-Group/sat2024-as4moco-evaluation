# Replication Package for 'Choosing What Counts – Exploring Algorithm Selection for Model Counting'

Holds both 

## Reproduce as4moco run on already trained ML models
1. Install as4moco (see [installation guide](https://github.com/SoftVarE-Group/as4moco/blob/master/README.md#how-to-install))
2. Run analysis for each ML model on multiple instances (method `runNormalMultiple` in [as4moco Main](https://github.com/SoftVarE-Group/as4moco/blob/master/src/main/java/de/uulm/sp/fmc/as4moco/Main.java))
3. Extract all results to csv using [ReRunEvalExtractor](extractor/src/main/java/de/uulm/sp/fmc/as4moco/tools/ReRunEvalExtractor.java)

## Train new ML models
1. Install as4moco (see [installation guide](https://github.com/SoftVarE-Group/as4moco/blob/master/README.md#how-to-install))
2. Create a training script similar to [Fold 1](https://github.com/RSD6170/AutoFolio/blob/master/examples/MCC2022_T1_randomSplits_re/Training_1/example.py)
3. Add your user configuration to the [Facade](https://github.com/RSD6170/AutoFolio/blob/master/autofolio/facade/af_csv_facade.py), e.g. for only SATzilla Feature Extraction as used in our eval:  
[Line 55](https://github.com/RSD6170/AutoFolio/blob/0e3008a010b2ac023655c34107f9388575bdace5/autofolio/facade/af_csv_facade.py#L55): ``cs = self.af.get_cs(self.scenario, {"allowed_feature_groups":["Satzilla-BASE", "Satzilla-SP", "Satzilla-DIA", "Satzilla-CL", "Satzilla-UNIT", "Satzilla-LS", "Satzilla-LOBJOIS", "Satzilla-LP"]})``  
or none for a standard configuration
4. Use the generated model in other analyses