package IntervieQuestions.HowToFind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAllPairsOfElementsInAnArrayWhoseSumIsEqualToAGivenNumber {
    public static void main(String[] args) {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//
//                if(array[i] + array[j] == sum){
//                    map.put(array[i], array[j]);
//                }
//            }
//        }
//
//        for (Integer result : map.keySet()) {
//            System.out.println("(" + result + "," + map.get(result) + ")");
//        }
//        System.out.println();
   }

    private static void findThePairs(int[] array, int sum) {
        Arrays.sort(array);
        //Initializing  first index
        int firstIndex = 0;
        //Initializing last index
        int lastIndex = array.length - 1;

        while (firstIndex < lastIndex){
            if(array[firstIndex] + array[lastIndex] == sum){
                System.out.println(array[firstIndex]+" + "+array[lastIndex]+" = "+sum);

                //Increment firstIndex
                firstIndex++;

                //Decrement lastIndex
                lastIndex--;

                //If inputArray[i]+inputArray[j] is smaller than inputNumber
            } else if (array[firstIndex] + array[lastIndex] < sum){

                //then increment i
                firstIndex++;

                //If inputArray[i]+inputArray[j] is greater than inputNumber
            } else if (array[firstIndex] + array[lastIndex] > sum) {

                //then decrement j
                lastIndex--;
            }
        }
    }
}
