

public class Abstraction_4 {

// Abstraction is used to hide implementation details from the user.
    public static void main(String[] args) {

        MathematicalShape shape=new Circle();
        shape.calculateArea();
    }

}

abstract class MathematicalShape {
final double pi=22/7;

void readme() {
    System.out.println("this is a shape class");
}
    abstract double calculateArea();


}

class Circle extends MathematicalShape {

    int r;
    @Override
    double calculateArea() {
        return pi*r*r;
    }
}

class Square extends MathematicalShape {
    int r;

    @Override
    double calculateArea() {
        return r*r;
    }
}

class Cylinder extends MathematicalShape {
 int r;
 int h;
    @Override
    double calculateArea() {
        return pi*r*r*h;
    }
}

// Note--> if all the methods are abstract in abstract class then 100% abstraction will be provided.