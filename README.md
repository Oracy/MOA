# HoeffdingTree + SEAGenerator:
```java
EvaluatePrequential -l trees.HoeffdingTree -s (ConceptDriftStream -s (generators.SEAGenerator -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 4 -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 3 -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 2 -b) -d (generators.SEAGenerator -b) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# NaiveBayes + SEAGenerator:
```java
EvaluatePrequential -l bayes.NaiveBayes -s (ConceptDriftStream -s (generators.SEAGenerator -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 4 -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 3 -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 2 -b) -d (generators.SEAGenerator -b) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# kNN + SEAGenerator:
```java
EvaluatePrequential -l lazy.kNN -s (ConceptDriftStream -s (generators.SEAGenerator -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 4 -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 3 -b) -d (ConceptDriftStream -s (generators.SEAGenerator -f 2 -b) -d (generators.SEAGenerator -b) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# 
```java
```

# HoeffdingTree + AgrawalGenerator:
```java
EvaluatePrequential -l trees.HoeffdingTree -s (ConceptDriftStream -s (generators.AgrawalGenerator -f 5 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 4 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 3 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 2 -b) -d (generators.AgrawalGenerator -b) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# NaiveBayes + AgrawalGenerator:
```java
EvaluatePrequential -l bayes.NaiveBayes -s (ConceptDriftStream -s (generators.AgrawalGenerator -f 5 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 4 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 3 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 2 -b) -d (generators.AgrawalGenerator -b) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# kNN + AgrawalGenerator:
```java
EvaluatePrequential -l lazy.kNN -s (ConceptDriftStream -s (generators.AgrawalGenerator -f 5 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 4 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 3 -b) -d (ConceptDriftStream -s (generators.AgrawalGenerator -f 2 -b) -d (generators.AgrawalGenerator -b) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# 
```java
```

# HoeffdingTree + AssetNegotiationGenerator:
```java
EvaluatePrequential -l trees.HoeffdingTree -s (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 5) -d (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 4) -d (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 3) -d (ConceptDriftStream -s generators.AssetNegotiationGenerator -d (generators.AssetNegotiationGenerator -f 2) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# NaiveBayes + AssetNegotiationGenerator:
```java
EvaluatePrequential -l bayes.NaiveBayes -s (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 5) -d (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 4) -d (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 3) -d (ConceptDriftStream -s generators.AssetNegotiationGenerator -d (generators.AssetNegotiationGenerator -f 2) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# kNN + AssetNegotiationGenerator:
```java
EvaluatePrequential -l lazy.kNN -s (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 5) -d (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 4) -d (ConceptDriftStream -s (generators.AssetNegotiationGenerator -f 3) -d (ConceptDriftStream -s generators.AssetNegotiationGenerator -d (generators.AssetNegotiationGenerator -f 2) -p 200000) -p 200000) -p 200000) -p 200000) -i 1000000 -f 1000
```

# 
```java
```