package inheritance.InheritanceInterface;

public class Main {
    public static void main(String[] args) {

        creatRelis(new Crusian());
        creatRelis(new Pike());
        creatRelis(new Whale());
    }

    public static void creatRelis(Swimmable swimmable) {
        swimmable.swim();
    };
}
