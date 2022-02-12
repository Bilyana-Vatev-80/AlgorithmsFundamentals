package ExerciseRecursionAndCombinatorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolTeams {

    public static String[] girls;
    public static String[] boys;

    public static String[] girlsCombinations = new String[3];
    public static String[] boysCombinations = new String[2];

    public static List<String> allGirls = new ArrayList<>();
    public static List<String> allBoys = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        girls = scanner.nextLine().split(", ");
        boys = scanner.nextLine().split(", ");

        combinationGirls(0,0);
        combinationBoys(0,0);

        for (String girl : allGirls) {
            for (String boy : allBoys) {
                System.out.println(girl + ", " + boy);
            }
        }
    }

    private static void combinationBoys(int index, int start) {
        if(index == boysCombinations.length){
            allBoys.add(String.join(", ", boysCombinations));
            return;
        }

        for (int i = 0; i < boys.length; i++) {
            boysCombinations[index] = boys[i];
            combinationBoys(index + 1, i + 1);
        }
    }

    private static void combinationGirls(int index, int start) {
        if(index == girlsCombinations.length){
            allGirls.add(String.join(", ", girlsCombinations));
            return;
        }

        for (int i = 0; i < girls.length; i++) {
            girlsCombinations[index] = girls[i];
            combinationGirls(index + 1, i + 1);
        }
    }
}
