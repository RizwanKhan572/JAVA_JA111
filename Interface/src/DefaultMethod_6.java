

public class DefaultMethod_6 {

    public static void main(String[] args) {
        Food dosa= new Dosa();
        dosa.dineIn();
        dosa.deliver();
        Idli idli= new Idli();
        idli.dineIn();
        idli.deliver();
        Food.eat();
    }

}

/*
  1.interfaces can not have concrete method
  2.interface supports multiple inheritance.
  3.all the variable of an interface final,public and static
  4.an interface can not provide the implementation of abstract class
  5.an interface always will be super type and abstract class.
  6.an interface can extend another java interface only.
  7.members if java interface are public by default.
  an interface gives 100% abstraction with exception default method and static method.
 */
interface  Food {

    void dineIn();
    default void deliver() {
        System.out.println("delivering food");
    }
    static void eat() {     // abstract static don't go together99
        System.out.println("eat food");
    }
}

// if you add a new method in an interface
// implementation will break;
// backward incompatibility


class Dosa implements Food {


    @Override
    public void dineIn() {
        System.out.println("serving Dosa....");
    }


}

class Idli implements Food {
    public void dineIn() {
        System.out.println("serving Idli...");
    }
}