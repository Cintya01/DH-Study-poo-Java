import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


//        Map<String,String> countryCapitals = new HashMap<>();
//
//        countryCapitals.put("Chile", "Stgo");
//        countryCapitals.put("Argentina", "Bns Aires");
//        countryCapitals.put("Ecuador", "Quito");
//        countryCapitals.put("Francia", "Paris");
//
//        System.out.println(countryCapitals);
//
//        countryCapitals.remove("Francia");
//
//        System.out.println(countryCapitals);

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("a", 7.3, 1));
        studentMap.put(2, new Student("b", 5.3, 2));
        studentMap.put(3, new Student("c", 9.3, 3));
        studentMap.put(4, new Student("d", 4.3, 4));

        System.out.println(studentMap);
    }
}