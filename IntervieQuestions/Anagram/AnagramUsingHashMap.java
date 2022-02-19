package IntervieQuestions.Anagram;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AnagramUsingHashMap {
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }

    private static void isAnagram(String s1, String s2) {

        String copyOfS1 = s1.replaceAll("\\s+", "");
        String copyOfS2 = s2.replaceAll("\\s+", "");

        boolean status = true;

        if(copyOfS1.length() != copyOfS2.length()){
            status = false;
        } else {

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < copyOfS1.length(); i++) {
                char charAsKey = copyOfS1.charAt(i);

                int charCountAsValue = 0;

                if(map.containsKey(charAsKey)){
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey, ++charCountAsValue);
                charAsKey = copyOfS2.charAt(i);

                charCountAsValue = 0;

                if(map.containsKey(charAsKey)){
                    charCountAsValue = map.get(charAsKey);
                }
                map.put(charAsKey, --charCountAsValue);

                for (Integer value : map.values()) {
                    if(value != 0){
                        status = false;
                    }
                }
            }
        }
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
