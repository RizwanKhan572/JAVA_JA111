
public class IsThereConflictsInMultipleImplementation_5 {

    public static void main(String[] args) {
        Square square=new Square();
        square.getS();
        square.draw();
    }
}

interface ShapeInterface {
    String s="Shape";
    void draw();
}

interface RectangleInterface {
    String s="Rectangle";
    void draw();
}
// the visibility of subtype method should have >= the visibility parent type method.
class Square implements ShapeInterface, RectangleInterface {

public void draw() {
    System.out.println("method of shape interfafce");
}

void getS() {
    System.out.println(RectangleInterface.s);
    System.out.println(ShapeInterface.s);
}

}

// public-> protected, default-> private