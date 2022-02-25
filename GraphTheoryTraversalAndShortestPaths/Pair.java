package GraphTheoryTraversalAndShortestPaths;

public class Pair <U, V>{
    public final U duplicates;
    public final V missingNumber;

    public Pair(U duplicates, V missingNumber) {
        this.duplicates = duplicates;
        this.missingNumber = missingNumber;
    }

    @Override
    public String toString(){
        return "The duplicates are " + duplicates + "The missingNumber are " + missingNumber;
    }
}
