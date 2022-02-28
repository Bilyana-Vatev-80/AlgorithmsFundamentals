package IntervieQuestions.FindAllPermutationsOfStringRecursively;

public class FindAllPermutationsOfStringRecursively {
    /*
    Write a java program to find
    all permutations of a string recursively.
    For example, all permutations of string “JSP“ are,

JSP

     */
    public static void main(String[] args) {
        stringPermutation("JSP");
    }

    private static void stringPermutation(String input) {
        stringPermutation("", input);
    }

    private static void stringPermutation(String permutation, String input) {
        if(input.length() == 0){
            System.out.println(permutation);
        } else {
            for (int i = 0; i <input.length(); i++) {
                stringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
}
