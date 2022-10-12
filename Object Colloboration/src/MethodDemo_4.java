public class MethodDemo_4 {

    public static void main(String[] args) {

        Simple simple=new Simple(); // creating obj of Simple class for accessing its data.
        simple.funA();
        System.out.println(simple.sum(6,4));// calling sum method and result will get here.
        System.out.println(simple.factorial(4));
        Simple.Method(); // static methods are directly accessible here.
    }
}

class Simple {
    void funA() {
        System.out.println("inside funA");
    }

    int sum(int a,int b) {
        printSum(a+b);  // one method can call other method.
        return a+b;
    }

    int factorial (int num) {
        if(num==1 || num==2) {
            return num;
        }
        else {
            return num*factorial(num-1);
        }
    }

    static void Method() {
        System.out.println("I am a static method");
    }

    void printSum(int a) {
        System.out.println("printSum is "+a);
    }
}