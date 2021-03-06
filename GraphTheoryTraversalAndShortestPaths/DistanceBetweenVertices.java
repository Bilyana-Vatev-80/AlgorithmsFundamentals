package GraphTheoryTraversalAndShortestPaths;

import java.util.Arrays;
import java.util.Scanner;

public class DistanceBetweenVertices {

    public static int[][] graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nodes = Integer.parseInt(scanner.nextLine());
        int pairs = Integer.parseInt(scanner.nextLine());

        graph = new int[nodes + 1][];

        for (int i = 1; i <= nodes ; i++) {
           String[] edges = scanner.nextLine().split(":");

           if(edges.length == 1){
               graph[i] = new int[0];
           } else {
               graph[i] = Arrays.stream(edges[1]
                               .split("\\s+"))
                       .mapToInt(Integer::parseInt)
                       .toArray();
           }
        }

        while (pairs-- > 0){
            int[] relations = Arrays.stream(scanner.nextLine().split("-"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
