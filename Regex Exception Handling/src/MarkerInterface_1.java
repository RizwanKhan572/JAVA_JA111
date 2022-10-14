
import java.io.Serializable;
public class MarkerInterface_1 {

    public static void main(String[] args) {
        MyClass obj =new MyClass();
    }
}

interface MyMarkerInterface{};
class MyClass implements Serializable,Cloneable {

    int i;

}