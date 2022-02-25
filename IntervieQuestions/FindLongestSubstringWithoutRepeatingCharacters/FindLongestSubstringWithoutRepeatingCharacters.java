package IntervieQuestions.FindLongestSubstringWithoutRepeatingCharacters;

import java.util.LinkedHashMap;

public class FindLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        /*
        Write a java program or function to find the longest substring
        without repeating characters in a given string. For example,
        if “javaconceptoftheday” is the input string, then the longest
        substring without repeating or duplicate characters
         is “oftheday” and its length is 8.
         */

        longestSubstring("javaconceptoftheday");

        System.out.println("==========================");
    }

    private static void longestSubstring(String input) {
        char[] chatArray = input.toCharArray();

        String longestSubstring = null;
        int longestSubstringLength = 0;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chatArray.length; i++) {
            char ch = chatArray[i];

            if(!map.containsValue(ch)){
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > longestSubstringLength){
                longestSubstringLength = map.size();
                longestSubstring = map.entrySet().toString();
            }
        }

        System.out.println("Input String : "+input);

        System.out.println("The longest substring : "+longestSubstring);

        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
}
