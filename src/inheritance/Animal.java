package inheritance;

public class Animal {

    public static String animalStaticField = " animalStaticField ";
    String family;
    int age;



    static {
        System.out.println("Static block Animal");
        System.out.println("-------------------------");
        System.out.println("Статическая переменная Animal вызванная в статическом блоке Animal " + animalStaticField);
        //System.out.println("Статическая переменная Crocodile в классе Animal вызванная в статическом блоке Animal " + Crocodile.crocodileStaticField);
        System.out.println("---------------------------");

    }

    {
        System.out.println("Блок инициализации статической переменной в Animal" + animalStaticField);
        System.out.println("Блок инициализации статической переменной Crocodile в Animal " + Crocodile.crocodileStaticField);
    }



    public Animal(String family, int age) {
        System.out.println("Конструктор Animal------------");
        System.out.println("Статическая переменная Animal вызванная в кострукторе " + animalStaticField);
        System.out.println("Статическая переменная Crocodile в классе Animal вызванная в конструкторе " + Crocodile.crocodileStaticField);
        System.out.println("До инициализации Animal------------------------");
        System.out.println("Animal family до this.family = family; " + this.family);
        System.out.println("Animal age до this.age = age; " + this.age);
        System.out.println("Инициализация конструктора Animal-----------------------");
        this.family = family;
        this.age = age;
        System.out.println("Animal family после  this.family = family;" + this.family);
        System.out.println("Animal age после this.age = age; " + this.age);
    }

}
