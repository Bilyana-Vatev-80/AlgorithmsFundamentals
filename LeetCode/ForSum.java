package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[]{1,0,-1,0,-2,2};
        int target = Integer.parseInt(scanner.next());

        System.out.println(fourSum(nums,target));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int low = j + 1, high = nums.length - 1;
                int rem = target - (nums[i] + nums[j]);

                while (low < high){
                    if(nums[low] + nums[high] == rem){
                        result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]){
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]){
                            high--;
                        }
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] < rem){
                        low++;
                    } else {
                        high--;
                    }
                }
                while (j + 1 < nums.length - 1 && nums[j + 1] == nums[j]){
                    j++;
                }
            }
            while (i+1< nums.length-1 && nums[i+1]== nums[i]){
                i++;
            }
        }
        return result;
    }
}
