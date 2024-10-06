package generic;

public class Team {
    String name;
    Integer scope;

    public Team(String name, Integer scope) {
        this.name = name;
        this.scope = scope;
    }

    public Team() {
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
