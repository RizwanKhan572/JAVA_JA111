
public class EarlyLateBinding_7 {

    public static void main(String[] args) {

        Parent parent=new Child();
        parent.sayHi();
    }

}

class Parent {
    void sayHi() {
        System.out.println("hiParent");
    }

}

class Child extends Parent {
    @Override
    void sayHi() {
        System.out.println("hiChild");
    }
}