package nadiatests;

import java.math.BigDecimal;
import java.util.*;
// https://www.tutorialspoint.com/java8/java8_streams.htm
public class Java8ListContainsNameJPL {
    public static void main(String args[]) {
        List<Staff> list = new ArrayList<>();
        list.add(new Staff("Harry",1,"", BigDecimal.ONE, null));
        list.add(new Staff("John",1,"", BigDecimal.ONE, null));
        list.add(new Staff("Kate",1,"", BigDecimal.ONE, null));
        list.add(new Staff("Larry",1,"", BigDecimal.ONE, null));
        list.add(new Staff("Tony",1,"", BigDecimal.ONE, null));

        System.out.println(containsName(list, "Kate"));
        System.out.println(containsName2(list, "Kate"));
        System.out.println(containsName3(list, "Kate"));
    }
     // stream() − Returns a sequential stream considering collection as its source.
    // If a value is present, isPresent() will return true and get() will return the value.
    public static boolean containsName(final List<Staff> list, final String name){
        return list.stream().map(Staff::getName).filter(name::equals).findFirst().isPresent();
    }
    //checks if an element is in an list
    public static boolean containsName2(final List<Staff> list, final String name){
        return list.stream().filter(o -> o.getName().equals(name)).findFirst().isPresent();
    }

    // ********* JPL
    public static int containsName3(final List<Staff> list, String name) {
        Staff staff = (new Staff(name,1,"", BigDecimal.ONE, null));
        int index = Collections.binarySearch(list, staff, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("binarySearch for "+name+" "+index);

        int index2 = Collections.binarySearch(list, staff, new SortByStaffName());
        System.out.println("binarySearch using Comparator for "+name+" = "+index2);
        return index2;
    }
}
class SortByStaffName implements Comparator<Staff> {   // Used for sorting in ascending order of
     public int compare(Staff a, Staff b) {
         return a.getName().compareTo(b.getName());
     }
 }