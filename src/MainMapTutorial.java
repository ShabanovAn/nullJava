import java.util.HashMap;

public class MainMapTutorial {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("John", 12345);
        employeeMap.put("Jane", 54321);
        employeeMap.put("Bob", 123123);


        System.out.println(employeeMap);
        System.out.println(employeeMap.get("Jane"));
    }
}
