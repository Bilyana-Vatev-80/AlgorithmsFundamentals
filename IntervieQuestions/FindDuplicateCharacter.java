package IntervieQuestions;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = text.toCharArray();

        for (char c : charArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        Set<Character> charInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In " + text);

        for (Character character : charInString) {
            if(charCountMap.get(character) > 1){
                System.out.println(character + " : " + charCountMap.get(character));
            }
        }
    }
}
