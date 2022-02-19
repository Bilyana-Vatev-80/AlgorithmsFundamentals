package IntervieQuestions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number : ");

        int num=scanner.nextInt(), sum, result = 0;

        String toString=num+"";

        System.out.println(toString);

        char[] numArray=toString.toCharArray();

        for(int i=0;i<numArray.length;i++)
        {
            sum = Character.getNumericValue(numArray[i]);
            result += Math.pow(sum, numArray.length);
        }
        System.out.println((result == num) ? "number is armstrong":"number is not armstrong");
    }
}
