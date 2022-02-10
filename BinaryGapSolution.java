import java.util.Scanner;

public class BinaryGapSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String binaryNumber = Integer.toBinaryString(n);

        String[] gaps = binaryNumber.replaceAll("0+$", "").split("1");

        int maxLength = 0;
        for (String gap : gaps) {
            if(gap.length() > 0 && gap.length() > maxLength){
                maxLength = gap.length();
            }
        }
       // return maxLength;
    }
}
