import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String a[]){
        Map<String, Integer> students = new HashMap<>();
        students.put("Naveen", 56);
        students.put("Sohail", 23);
        students.put("Vamsi", 92);
        students.put("Bhanu", 78);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key) );
        }
    }
}
