public class PredictOutput_3 {
    int a=200;
    A a1= new A();
    public static void main(String[] args) {
        PredictOutput_3 obj= new PredictOutput_3();

        obj.a1.funA();

    }
}

class A {
    int x=20;
    void funA() {
        System.out.println("inside funA");
    }

}
