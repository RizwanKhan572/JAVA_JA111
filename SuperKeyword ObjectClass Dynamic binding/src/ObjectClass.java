public class ObjectClass {

    public static void main(String[] args) {
        Object object;
          MyClass myClass=new MyClass();
        System.out.println(myClass);
        Student student=new Student("Rizwan");
        System.out.println(student);
    }
}

class MyClass extends Object {

    public String toString() {
        return "Hello";
    }

}