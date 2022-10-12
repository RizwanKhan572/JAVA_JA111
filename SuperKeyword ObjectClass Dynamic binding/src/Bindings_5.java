

public class Bindings_5 {
    /*
    Two time of Polymorphism
    1. Method Overloading  aka static binding aka compile time polymorphism.
    2. Method Overriding aka dynamic binding aka runtime polymorphism.
     */
    void one(String s) {}

    void one(int i) {}

    public static void main(String[] args) {
      Bindings_5 ob=new Bindings_5();
      ob.one(1);
    }
}
