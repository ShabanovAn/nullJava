
// Java program to show 
// ConcurrentModificationException 

import java.util.Iterator;
import java.util.ArrayList;

public class modificationError {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");


        try {
            System.out.println("ArrayList: ");
            Iterator<String> iter = arr.iterator();

            while (iter.hasNext()) {
                System.out.print(iter.next() + ", ");
            }

            System.out.println(
                    "\n\nTrying to add"
                            + " an element in "
                            + "between iteration: "
                            + arr.add("Five"));

            System.out.println("\nUpdated ArrayList: ");
            iter = arr.iterator();

            while (iter.hasNext()) {
                System.out.print(iter.next() + ", ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} 