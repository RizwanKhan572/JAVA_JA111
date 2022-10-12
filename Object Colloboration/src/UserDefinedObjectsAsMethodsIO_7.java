public class UserDefinedObjectsAsMethodsIO_7 {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.age=23;
        System.out.println(myMethod(employee));
        Employee employee1=createObject();
        //System.out.println(employee1.age);
        if(employee1==null) {  // null pointer exception handling.
            System.out.println("employee is null ,can't print the age");
        }
        else {
            System.out.println(employee1.age);
        }
    }
// A method can take objects as input as well as it can return objects as an output
   static int myMethod(Employee employee) {
        return employee.age;
  }

  static Employee createObject() {
        // return null;
      // null is subtype of all objects.


        return null;
  }
}

class Employee {
    int age;
}