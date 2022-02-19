package IntervieQuestions.CheckOfTheEqualityOfTwoArrayes;

import java.util.Scanner;

public class Different {
    public static void main(String[] args) {
        boolean result = true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the No of elements in A:");
        int n =scan.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the No of elements in B:");
        int m =scan.nextInt();
        int[] B = new int[m];
        System.out.println("Enter the elements in A:");
        for(int i=0;i<n;i++)
        {
            A[i] = scan.nextInt();
        }
        System.out.println("Enter the elements in B:");
        for(int i=0;i<m;i++)
        {
            B[i]= scan.nextInt();
        }
        if(A.length==B.length)
        {
            for(int i=0;i<A.length;i++)
            {
                for(int k=0;k<B.length;k++)
                {
                    if(A[i]==B[k])
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                    }
                }
            }
            System.out.println(result);
        }
        if(A.length!=B.length)
        {
            System.out.println("Both Arrays are not the same length");
        }
    }
}
