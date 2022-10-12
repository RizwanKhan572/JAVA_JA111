

public class UserDefinedObjectsInArray_3 {

    public static void main(String[] args) {
        Student[] students=new Student[2];   // Array created
        Student s1 = new Student("Rizwan");  // obj1 created
         Student s2 = new Student("Ravi");   // obj2 created
          students[0]=s1;
          students[1]=s2;
        for (Student s:students
             ) {
            System.out.println(s.name);

        }
    }
}
