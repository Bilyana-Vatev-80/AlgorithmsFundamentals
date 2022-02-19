package IntervieQuestions.CheckOfTheEqualityOfTwoArrayes;

import java.util.Arrays;

public class UsingArrayEqualMethod {
    public static void main(String[] args) {
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};

        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        System.out.println(Arrays.equals(s1, s2));
        System.out.println(Arrays.equals(s1, s3));

        //If you want to compare two arrays which have same number of elements and same set of elements but in different positions, then first sort both arrays using Arrays.sort() method and then compare using Arrays.equals() method

        String[] s4 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};

        String[] s5 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

        Arrays.sort(s4);
        Arrays.sort(s5);

        System.out.println(Arrays.equals(s4, s5));
    }
}
