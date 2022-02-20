package IntervieQuestions.HowToFind;

import java.util.HashMap;
import java.util.Map;

public class HowToCountOfEachCharacterInString {
    public static void main(String[] args) {
        characterCount("Java J2EE Java JSP J2EE");

        characterCount("All Is Well");

        characterCount("Done And Gone");
    }

    private static void characterCount(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        //Converting given string to char array
        char[] strArray = inputString.toCharArray();

        //checking each char of strArray
        for (char c : strArray) {
            if(charCountMap.containsKey(c)){
                //If char 'c' is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        System.out.println(inputString + " : " + charCountMap);
    }
}
