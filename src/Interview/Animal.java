package Interview;

public class Animal {

    public static String AnimalStaticField = "Animal Static Field";
    String family;
    int age;

    public Animal(int age, String family) {
        System.out.println("Animal static text: " + AnimalStaticField);
        System.out.println("Crocodile static text: " + Crocodile.CrocodileStaticField);
        System.out.println("Animal age: " + this.age);
        System.out.println("Animal age: " + this.family);
        this.family = family;
        this.age = age;
        System.out.println("Animal age: " + this.age);
        System.out.println("Animal age: " + this.family);
    }
}
