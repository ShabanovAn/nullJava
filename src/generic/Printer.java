package generic;

public class Printer<T extends Team> {
    T first;


    public Printer(T first) {
        this.first = first;

    }

    public void pring() {
        System.out.println(first);
    }
}
