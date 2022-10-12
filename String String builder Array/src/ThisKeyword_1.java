

public class ThisKeyword_1 {

    int a=5;   // instance variable


    void funA() {

        int a=10; // local variable
        System.out.println("Print me");
        System.out.println(a);
        System.out.println(this.a);
    }





    public static void main(String[] args) {

        ThisKeyword_1 obj= new ThisKeyword_1();
        obj.funA();

    }
}
