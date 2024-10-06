package inheritance;

public class Crocodile extends Animal {

    public static String crocodileStaticField = " CrocodileStaticField ";
    int numberOfTeeth;

    static {
        System.out.println("Static block Crocodile");
        System.out.println("-------------------------");
        System.out.println("Статическая переменная Animal в классе Crocodile вызванная в статическом блоке Crocodile " + Animal.animalStaticField);
        System.out.println("Статическая переменная Crocodile в классе Crocodile вызванная в статическом блоке Crocodile " + Crocodile.animalStaticField);
        System.out.println("Статическая переменная Animal вызванная в статическом блоке Crocodile " + animalStaticField);
        System.out.println("---------------------------");

    }

    {
        System.out.println("Блок инициализации статической переменной в Crocodile" + animalStaticField);
        System.out.println("Блок инициализации статической переменной Crocodile в Crocodile " + Crocodile.crocodileStaticField);
    }

    public Crocodile(String family, int age, int numberOfTeeth) {
        super(family, age);
        System.out.println("Статическая переменная Crocodile в классе Crocodile " + Crocodile.crocodileStaticField);
        System.out.println("Статическая переменная Animal в классе Crocodile animalStaticField " + animalStaticField);
        System.out.println("До инициализации Crocodile -------------");
        System.out.println("Crocodile family; до инициализации; " + this.family);
        System.out.println("Crocodile age до инициализации;" + this.age);
        System.out.println("Crocodile numberOfTeeth; до инициализации;" + this.numberOfTeeth);
        System.out.println("Инициализация конструктора Crocodile---------");
        this.numberOfTeeth = numberOfTeeth;
        System.out.println("Crocodile family после инициализации ;" + this.family);
        System.out.println("Crocodile age после инициализации: " + this.age);
        System.out.println("Crocodile numberOfTeeth после инициализации: " + this.numberOfTeeth);
    }
}
