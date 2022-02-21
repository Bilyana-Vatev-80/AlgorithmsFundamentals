package IntervieQuestions.HowToRemoveDuplicateElementsFromArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateElementWithHashSet {
    public static void main(String[] args) {
        /*
        They are not in the insertion order.
        If you want insertion order of elements to be maintained even
        after removing the duplicate elements, then this method is not recommended.
         */
        List<String> listOfDuplicateElement = new ArrayList<>();

        listOfDuplicateElement.add("JAVA");

        listOfDuplicateElement.add("J2EE");

        listOfDuplicateElement.add("JSP");

        listOfDuplicateElement.add("SERVLETS");

        listOfDuplicateElement.add("JAVA");

        listOfDuplicateElement.add("STRUTS");

        listOfDuplicateElement.add("JSP");

        //Printing listWithDuplicateElements

        System.out.println("ArrayList With Duplicate Elements :");
        System.out.println(listOfDuplicateElement);

        //Constructing HashSet using listWithDuplicateElements

        Set<String> set = new HashSet<>(listOfDuplicateElement);

        //Constructing listWithoutDuplicateElements using set

        List<String> listWithoutDuplicateElements = new ArrayList<>(set);

        //Printing listWithoutDuplicateElements

        System.out.println("ArrayList After Removing Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements);
    }
}
