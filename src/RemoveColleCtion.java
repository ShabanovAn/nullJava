import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveColleCtion {
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

                System.out.println(
                        "\n\nTrying to add"
                                + " an element in "
                                + "between iteration\n");
                arr.add("Five");
            }
        } catch (Exception e) {
            System.out.println(e + " SDSD");
        }
    }
}
