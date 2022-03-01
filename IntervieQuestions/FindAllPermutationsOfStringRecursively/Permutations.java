package IntervieQuestions.FindAllPermutationsOfStringRecursively;

public class Permutations {
    public static void main(String[] args) {
    //    String str = "ABC";
        String str1 = "JPS";
        findPermutations(str1);
    }

    private static void findPermutations(String str) {
        //base case
        if(str == null || str.length() == 0){
            return;
        }

        permutations(str.toCharArray(), 0);
    }

    private static void permutations(char[] chars, int currentInteger) {

        if(currentInteger == chars.length - 1){
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentInteger; i < chars.length; i++) {
            swap(chars, currentInteger, i);
            permutations(chars, currentInteger + 1);
           swap(chars, currentInteger, i);
        }
    }

    private static void swap(char[] chars, int start, int end) {
         char temp = chars[start];
         chars[start] = chars[end];
         chars[end] = temp;
    }
}
