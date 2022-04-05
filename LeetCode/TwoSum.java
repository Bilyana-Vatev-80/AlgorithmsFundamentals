package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        /*
        Given an array of integers
         nums and an integer target, return indices of the
          two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        solution(new int[]{2, 7, 11, 15},target);

    }

    private static void solution(int[] numArray, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < numArray.length; i++) {
            if(map.containsKey(numArray[i])){
                int index = map.get(numArray[i]);
                result[0] = index;
                result[1] = i;
                break;
            } else {
                map.put(target - numArray[i], i);
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
