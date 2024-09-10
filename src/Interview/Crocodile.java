package Interview;

public class Crocodile extends Animal {

    public static String CrocodileStaticField = "Crocodile Static Field";
    int bumerOfTeceth;

    public Crocodile(int age, String family, int bumerOfTeceth) {
        super(age, family);
        System.out.println("Animal static text: " + AnimalStaticField);
        System.out.println("Crocodile static text: " + Crocodile.CrocodileStaticField);
        System.out.println("Crocodile age: " + this.age);
        System.out.println("Crocodile age: " + this.family);
        System.out.println("Crocodile initialization bumerOfTeceth: " + this.bumerOfTeceth);
        this.bumerOfTeceth = bumerOfTeceth;
        System.out.println("Crocodile age: " + this.age);
        System.out.println("Crocodile age: " + this.family);
    }
}