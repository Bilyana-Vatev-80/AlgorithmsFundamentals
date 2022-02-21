package IntervieQuestions.FindDuplicatesInArray;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWithSet {
    public static void main(String[] args) {
        int[] array = {111, 333, 555, 777, 333, 444, 555};

        findDuplicateInArray(array);
        findDuplicatesUsingBruteForce(array);
        findDuplicateUsingSortMethod(array);
        findDuplicateUsingSet(array);
        findDuplicateUsingMap(array);
    }

//Method 4 : Using HashMap
    private static void findDuplicateUsingMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            if(map.get(element) == null){
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if(entry.getValue() > 1){
                System.out.println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
            }
        }
    }

    //Method 3 : Using HashSet
    private static void findDuplicateUsingSet(int[] array) {
        Set<Integer> integerSet = new HashSet<>();

        for (Integer integer : array) {
            if(!integerSet.add(integer)){
                System.out.println("Duplicate Element : " + integer);
            }
        }
    }

    //Method 2 : Sorting Method
    private static void findDuplicateUsingSortMethod(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i+1]){
                System.out.println("Duplicate Element: " + array[i]);
            }
        }
    }

    //Method 3 : /bruteForce
    private static void findDuplicatesUsingBruteForce(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    System.out.println("Duplicate Element: " + array[i]);
                }
            }
        }
    }

    // Using set
    private static void findDuplicateInArray(int[] array) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

//        for (int value : array) {
//            if(!unique.add(value)){
//                duplicates.add(value);
//            }
//        }
        Set<Integer> duplicateElements = Arrays.stream(array).filter(i -> !unique.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(duplicateElements);
    }
}
