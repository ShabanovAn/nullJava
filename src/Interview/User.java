package Interview;

public class User {

    int id;
    int phone;
    String name;
    Sex sex;
    int age;
    boolean inCorrect;


    public User(int id, int phone, String name, Sex sex, int age) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", inCorrect=" + inCorrect +
                '}';
    }

}
