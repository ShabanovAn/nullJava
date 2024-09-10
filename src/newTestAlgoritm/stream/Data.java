package newTestAlgoritm.stream;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<Person> person = new ArrayList<>();

    static {
         Person person1 = new Person("Иван", "Иванов", 20);
         Person person2 = new Person("Петр", "Иванов", 22);
         Person person3 = new Person("Саша", "Козюлькин", 33);
         Person person4 = new Person("Кристина", "Шалавина", 19);
         Person person5 = new Person("Настя", "Кукушкина", 27);
         Person person6 = new Person("Андрей", "Крючков", 89);
         Person person7 = new Person("Костя", "Собакин", 22);
         Person person8 = new Person("Иван", "Иванов", 16);
         Person person9 = new Person("Толик", "Холов", 74);
         Person person10 = new Person("Кантимир", "Кучкин", 47);


         person.add(person1);
         person.add(person2);
         person.add(person3);
         person.add(person4);
         person.add(person5);
         person.add(person6);
         person.add(person7);
         person.add(person8);
         person.add(person9);
         person.add(person10);
    }

    public static List<Person> getPersonList() {
        return person;
    }
}
