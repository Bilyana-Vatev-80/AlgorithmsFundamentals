package IntervieQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HowToFirstRepeatedAndNonRepeatedCharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Step 1 : Define one HashMap called charCountMap with
        // Character as key and Integer as value.
        // This map will hold the characters and their count in the given string.

        System.out.println("Enter the string :");
        String input = scanner.nextLine();

        firstRepeatedNonRepeatedChar(input);


    }

    private static void firstRepeatedNonRepeatedChar(String input) {

        //Creating a HashMap containing char as a key and occurrences as a value

        Map<Character, Integer> charCountMap = new HashMap<>();

        //Converting input to charArray
        char[] charArray = input.toCharArray();

        //Checking each char of charArray
        for (char c : charArray) {
            if(charCountMap.containsKey(c)){

                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c,charCountMap.get(c) + 1);
            } else {
                //If char is not present in charCountMap,
                //adding this char in charCountMap with 1 as it's value
                charCountMap.put(c,1);
            }
        }

        //checking for first non-repeated character

        for (char c : charArray) {
            if(charCountMap.get(c) == 1){
                System.out.println("First Non-Repeated Character In '"+input+"' is '"+c+"'");
                break;
            }
        }

        //checking for first repeated character

        for (char c : charArray) {
            if(charCountMap.get(c) > 1){
                System.out.println("First Repeated Character In '"+input+"' is '"+c+"'");
                break;
            }
        }

    }
}
