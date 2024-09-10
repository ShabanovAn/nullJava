package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//todo проверить список пользователей, всем ли больше 18
public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        List<User> users = new ArrayList<>(1000);
        for (int i = 0; i < 10; i++) {
            users.add(new User(2, i * random.nextInt(1000), "Petr", Sex.FEMALE, 13 + random.nextInt(100)));
        }
        boolean inCoorect2 = true;
        for (User user : users) {
            if(user.getAge() < 18) {
                inCoorect2 = false;
                System.out.println(user);
                break;
            }
        }
        System.out.println(users);



    }
}
