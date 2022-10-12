import com.sun.source.util.ParameterNameProvider;

public class Multilevel {

    public static void main(String[] args) {
        Child child=new Child();
        Object object=new Object();
    }
}

class GrandParent{

    GrandParent() {
        super();
        System.out.println("GP");
    }
}

class Parent extends GrandParent  {

    Parent() {
        super();
        System.out.println("Parent");
    }
}

class Child extends Parent  {
    Child() {
     super();
        System.out.println("Child");
    }
}