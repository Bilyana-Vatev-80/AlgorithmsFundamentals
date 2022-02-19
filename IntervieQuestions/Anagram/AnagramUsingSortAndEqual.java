package IntervieQuestions.Anagram;

import java.util.Arrays;

public class AnagramUsingSortAndEqual {
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

        boolean isAnagram = true;

        if(copyOfS1.length() != copyOfS2.length()){

            isAnagram = false;

        } else {

            char[] s1Array = copyOfS1.toLowerCase().toCharArray();
            char[] s2Array = copyOfS2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            isAnagram = Arrays.equals(s1Array, s2Array);

        }

        if(!isAnagram){
            System.out.println(s1 + " and " + s2 + "ara not anagram");
        } else {
            System.out.println(s1 + " and " + s2 + "ara anagram");
        }

    }
}
