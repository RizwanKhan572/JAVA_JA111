package PreClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

        HashMap<String,Student> hm=new HashMap<>();
        hm.put("Mumbai",new Student(1,"ram",500));
        hm.put("Delhi",new Student(2,"raju",600));
        hm.put("Banglore",new Student(3,"salman",680));

        Set<Map.Entry<String,Student>> keyValues =hm.entrySet();
        System.out.println(keyValues);
     for (Map.Entry<String,Student > all:keyValues) {
//         System.out.println(all);
         System.out.println("City name is "+all.getKey());
         System.out.println("=========================");
         Student student=all.getValue();
         System.out.println("rollno :"+student.getRollno());
         System.out.println("name :"+student.getName());
         System.out.println("marks :"+student.getMarks());
     }

    }

}
