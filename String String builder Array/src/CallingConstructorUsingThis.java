public class CallingConstructorUsingThis {

    public static void main(String[] args) {
           CallingConstructorUsingThis obj= new CallingConstructorUsingThis();
    }

    CallingConstructorUsingThis() {

        this(6);
        System.out.println("I am default Constructor");
    }

    CallingConstructorUsingThis(int var) {
        System.out.println(var);
    }
}
