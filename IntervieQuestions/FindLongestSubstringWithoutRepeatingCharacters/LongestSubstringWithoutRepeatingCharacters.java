package IntervieQuestions.FindLongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        longestSubstring(input);
        //abcabcbb, bbbbb, pwkew
    }

    private static void longestSubstring(String input) {
        int startPoint = 0;
        int expendPoint = 0;
        int maxPoint = 0;

        HashSet<Character> set = new HashSet<>();

        while (expendPoint < input.length()){
            if(!set.contains(input.charAt(expendPoint))){
                set.add(input.charAt(expendPoint));
                expendPoint++;
                maxPoint = Math.max(set.size(), maxPoint);
            } else {
                set.remove(input.charAt(startPoint));
                startPoint++;

            }
        }

        System.out.println(maxPoint);

    }
}
