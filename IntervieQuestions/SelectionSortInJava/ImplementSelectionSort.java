package IntervieQuestions.SelectionSortInJava;

public class ImplementSelectionSort {
    public static void main(String[] args) {
        /*
        Selection sort is a sorting algorithm which sorts the given
         array elements either in descending or ascending order by finding
          the misplaced element first and putting it in it’s final place.
         */
        selectionSort(new int[]{45, 84, 101, 62, 12, 45});

        selectionSort(new int[] {62, -45, 14, 8, -52, 45});

        selectionSort(new int[] {21, 12, 56, -48, 15, 45});
    }

    private static void selectionSort(int[] inputArray) {
        int temp, position;

        for (int i = 0; i < inputArray.length; i++) {
            position = i;

            //finding the position of smallest element
            // between (i+1)th element and last element
            for (int j = i + 1; j < inputArray.length; j++) {
                if(inputArray[j] < inputArray[position]){
                    position = j;
                }
            }

            temp = inputArray[i];
            inputArray[i] = inputArray[position];
            inputArray[position] = temp;
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
