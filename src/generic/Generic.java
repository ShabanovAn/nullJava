package generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {

       Printer<Adult> adultPrinter = new Printer<>(new Adult(55));
       adultPrinter.pring();


       Printer<Teenagers> teenagersPrinter = new Printer<>(new Teenagers(15));
       teenagersPrinter.pring();
    }
}
