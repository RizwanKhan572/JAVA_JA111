

public class SuperKeyword_4 {

    public static void main(String[] args) {
       Dog dog=new Dog();
       dog.display();

    }
}

/*
Using Super Keyword in java
1.super can be used to refer the immediate parent class variable.
2.super can be used to invoke the immediate parent class method. super.method.
3.super can be used to invoke the immediate parent class constructor.
 */
class Animal {
    String color="white";
    void eat() {
        System.out.println("Animal eats");
    }
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    String color="black";

    @Override
    void eat() {
        System.out.println("Dog eats");
    }


    void display() {
        System.out.println(color);
        System.out.println(super.color);
        eat();

    }
    Dog() {
       super();
        System.out.println("Dog constructor");
    }

}