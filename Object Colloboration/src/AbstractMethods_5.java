public class AbstractMethods_5 {

    public static void main(String[] args) {

        AbstractMethods_5 abs=new AbstractMethods_5();
        abs.concreteMethod(); // calling concreteMethod from here;
    }
    void concreteMethod() {
        System.out.println("body");
    }
}


abstract class ABC {
    abstract void calculateAreaOfAShape();

    }
