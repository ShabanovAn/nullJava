package newTestAlgoritm.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiTestTask {
    public static void main(String[] args) {

        List<Person> persons = Data.getPersonList();

//        List<Person> pers = persons.stream()
//                .filter(person -> person.getAge() > 30)
//               // .sorted()
//                .collect(Collectors.toList());

//                List<Person> pers = persons.stream()
//                .map(person -> new Person(person.getFirstName(), person.getLastName(), person.getAge() + 100))
//                .collect(Collectors.toList());


        List<Person> person2 = persons.stream()
                .filter(person1 -> person1.getAge() > 30)
                .collect(Collectors.toList());

        person2.forEach(System.out::println); //Ссылка на метод

        Optional<Person> person = persons.stream()
                .filter(person1 -> person1.getAge() > 30)
                //.findFirst();
                .findAny();

        System.out.println(person);
//
//        for (int i = 0; i < pers.size(); i++) {
//            System.out.println(pers.get(i));
//        }
//bject person2 = new Object();

    }
}
