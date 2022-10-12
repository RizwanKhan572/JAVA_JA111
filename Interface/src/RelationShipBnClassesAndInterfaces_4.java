

public class RelationShipBnClassesAndInterfaces_4 {

    // class extends another class. (only one)
    // class implements interface. (any);
    // interface extends interface. (any);

    // class A extends class B,class C // multiple inheritance not supported in java.
}

interface AnimalInterface {
    void eat();
}

interface BirdInterface {//extends AnimalInterface {

    void fly();
}

class Eagle implements BirdInterface, AnimalInterface {

    @Override
    public void eat() {
        System.out.println("eagle can eat");
    }

    @Override
    public void fly() {
        System.out.println("eagle can fly high");
    }
}
