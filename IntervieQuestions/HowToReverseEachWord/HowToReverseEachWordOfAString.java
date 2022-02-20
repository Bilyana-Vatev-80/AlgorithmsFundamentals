package IntervieQuestions.HowToReverseEachWord;

public class HowToReverseEachWordOfAString {
    public static void main(String[] args) {

        reverseEachWordOfString("Java Concept Of The Day");

        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

        reverseEachWordOfString("I am string not reversed");

        reverseEachWordOfString("Reverse Me");
    }

    private static void reverseEachWordOfString(String text) {
        String[] words = text.split("\\s+");

        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(text);
        System.out.println(reverseString);
        System.out.println("----------------------");
    }
}
