package IntervieQuestions.ReverseTheStringWithPreservingThePositionOfSpace;

public class ReverseTheStringWithPreservingThePositionOfSpace {
    public static void main(String[] args) {
        /*
        Write a java program to reverse a string with preserving the position of spaces.
        For example, if “I Am Not String” is the given string then the reverse of this
        string with preserving the position of spaces is “g ni rtS toNmAI”.
        Notice that the position of spaces in the original string are maintained
         in the reversed string also. That means, if the given string has a space at index
          3, then there should be also a space in the reversed string at index 3.
         */

        reverseString("I Am Not String");

    }

    private static void reverseString(String inputString) {
        int n = inputString.length();

        int start = 0; // begin of the string
        int end = n - 1; // the end of the string

        char[] strContain = inputString.toCharArray(); // convert string to chars

        while (start < end){
            if(strContain[start] == ' '){
                start++;
            } else if (strContain[end] == ' '){
                end--;
            } else {
                char temp = strContain[start];
                strContain[start] = strContain[end];
                strContain[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(String.valueOf(strContain));
    }
}
