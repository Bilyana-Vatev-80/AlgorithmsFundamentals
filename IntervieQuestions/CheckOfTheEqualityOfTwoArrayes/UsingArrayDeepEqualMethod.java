package IntervieQuestions.CheckOfTheEqualityOfTwoArrayes;

import java.util.Arrays;

public class UsingArrayDeepEqualMethod {
    public static void main(String[] args) {
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        System.out.println(Arrays.deepEquals(s1, s2));

        //Calling equals() method on same arrays will return false

        System.out.println(Arrays.equals(s1, s2));
    }
}
