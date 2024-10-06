package generic;

public class Adult extends Team{
    Integer age;

    public Adult(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "age=" + age +
                '}';
    }
}
