package IntervieQuestions.CheckOfTheEqualityOfTwoArrayes;

import java.util.Scanner;

public class IterativeMethod {
    public static void main(String[] args) {
        //This method is not recommended to check the equality of two arrays if the arrays are big in size.
        Scanner scanner = new Scanner(System.in);

        int[] arrayOne = {2,5,1,7,4};
        int[] arrayTwo = {2,5,1,7,4};

        boolean equalOrNot = true;

        for (int i = 0; i < arrayOne.length; i++) {
            if(arrayOne[i] != arrayTwo[i]){
                equalOrNot = false;
            }
        }

        if(!equalOrNot){
            System.out.println("Two Arrays Are Not Equal");
        } else {
            System.out.println("Two Arrays Are Equal");
        }

    }
}
