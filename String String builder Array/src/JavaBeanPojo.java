import java.beans.JavaBean;

public class JavaBeanPojo {

    public static void main(String[] args) {
          JavaBean_4 javabean =new JavaBean_4();
        System.out.println(javabean.getX());
        AnotherJavaBean_5 anotherJavaBean_5= new AnotherJavaBean_5();
        System.out.println(anotherJavaBean_5.getX());
    }

    // It is a reusable purely encapsulated java class which should have following properties.
    // 1. Class should be public
    // 2. All fields should be private
    // 3. For each field there should be a public getter and setter.
    // 4. It should zero argument constructor
    // 5. It may have parametrized constructor (it is not minimum requirement)

}


