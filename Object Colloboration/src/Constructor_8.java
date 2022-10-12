public class Constructor_8 {

    public static void main(String[] args) {
         MyClass obj=new MyClass();
          MyClass anotherObj= new MyClass(15);
        System.out.println(anotherObj.variable);
    }
}

class MyClass {
   int variable;

   // default constructor.
    MyClass() {
        System.out.println("");
    }

    // parameterized constructor.
    MyClass(int var) {
        variable=var;
    }
}
// Note-->
// 1.constructor can not be static.
// 2.constructor dosen't have return type.
// 3.constructor should be same name as class.

// Similarity b/w method and constructor.
// 1. both are functions.
// 2. both have args list.
// 3. both of them can be overloaded.