package nadiatests;

// http://www.geeksforgeeks.org/collections-binarysearch-java-examples/
/*
Arrays.binarysearch() vs Collections.binarySearch()
Arrays.binarysearch() works for arrays which can be of primitive data type also.
Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.
 */
// binarySearch()
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Java8BinarySearch {
    public static void main(String args[]) {
        findItemInAscendingList();
        findItemInDescendingList();
    }
    /*
    // ascending order
    public static int binarySearch(List slist, T key)

    // Returns index of key in sorted list sorted in       IMPORTANT - list is sorted
    // order defined by Comparator c.
    public static int binarySearch(List slist, T key, Comparator c)

    If key is not present, the it returns "(-(insertion point) - 1)".
    The insertion point is defined as the point at which the key
    would be inserted into the list.
     */
    public static void findItemInAscendingList()
     {
         List al = new ArrayList();
         al.add(1);
         al.add(2);
         al.add(3);
         al.add(10);
         al.add(20);
         // 10 is present at index 3.
         System.out.println(10+" -> "+Collections.binarySearch(al, 10));                        // 3
         System.out.println(1+" -> "+Collections.binarySearch(al, 1));                        // 0
         // 13 is not present. 13 would have been inserted
         // at position 4. So the function returns (-4-1)
         // which is -5.
         System.out.println(15+" -> "+Collections.binarySearch(al, 15));                         // -5
     }
    //descending order
    public static void findItemInDescendingList()
    {
        List al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(30);
        al.add(10);
        al.add(2);

        // The last parameter specifies the comparator method
        // used for sorting.
        System.out.println("Found 50 at index " + Collections.binarySearch(al, 50, Collections.reverseOrder()));
        System.out.println("Found 100 at index " + Collections.binarySearch(al, 100, Collections.reverseOrder()));

    }
}
