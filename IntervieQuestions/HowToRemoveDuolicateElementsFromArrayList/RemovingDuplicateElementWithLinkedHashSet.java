package IntervieQuestions.HowToRemoveDuolicateElementsFromArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemovingDuplicateElementWithLinkedHashSet {
    public static void main(String[] args) {
        /*
        In this method, we use LinkedHashSet to remove duplicate elements from ArrayList.
        As you know that LinkedHashSet doesn’t allow
        duplicate elements and also maintains the insertion order of elements.
         */
        List<String> listWithDuplicateElements = new ArrayList<>();

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("J2EE");

        listWithDuplicateElements.add("JSP");

        listWithDuplicateElements.add("SERVLETS");

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("STRUTS");

        listWithDuplicateElements.add("JSP");

        System.out.println("ArrayList With Duplicate Elements :");
        System.out.println(listWithDuplicateElements);

        LinkedHashSet<String> set = new LinkedHashSet<>(listWithDuplicateElements);

        List<String> listWithoutDuplicateElements = new ArrayList<>(set);

        System.out.println("ArrayList Without Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements);

    }
}
