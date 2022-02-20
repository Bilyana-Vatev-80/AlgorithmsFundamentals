package IntervieQuestions.HowToFindIntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;

public class DifferentExamole {
    public static void main(String[] args) {
        Integer[] num1 = {1, 2, 3, 4, 5, 4};

        Integer[] num2 = {3, 4, 5, 6, 7, 4};

//        int length1 = num1.length;
//        int length2 = num2.length;
//
//        int i = 0, j = 0, k = 0;
//
//        Arrays.sort(num1);
//        Arrays.sort(num2);
//
//        while (i < length1 && j < length2){
//            if(num1[i] < num2[j]){
//                i++;
//            }else if (num1[i] > num2[j]){
//                j++;
//            } else {
//                num1[k++] = num1[i++];
//                j++;
//            }
//        }
//
//        System.out.println(Arrays.toString(Arrays.copyOfRange(num1, 0, k)));

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for (Integer i : num1) {
            set1.add(i);
        }

        for (Integer i : num2) {
            if(set1.contains(i)){
                intersect.add(i);
            }
        }

        int size = intersect.size();
        int[] ans = new int[size];
        int index = 0;

        for (Integer i : intersect) {
            ans[index++] = i;
        }

        System.out.println(ans);
    }
}
