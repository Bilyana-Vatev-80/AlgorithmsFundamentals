package IntervieQuestions.HowToFind;

public class FindSecondLargestNumberInIntegerArray {
    public static void main(String[] args) {

        System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));

//        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));

//        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

//        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
    }

    private static int secondLargest(int[] array) {
        int firstLargest, secondLargest;

        if(array[0] > array[1]){
            //Checking first two elements of input array

            firstLargest = array[0];
            secondLargest = array[1];
        } else {
            //If second element is greater than first element

            firstLargest = array[1];
            secondLargest = array[0];
        }

        //Checking remaining elements of input array
        for (int i = 2; i < array.length; i++) {
            if(array[i] > firstLargest){
                //If element at 'i' is greater than 'firstLargest'

                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if(array[i] < firstLargest && array[i] > secondLargest){
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
