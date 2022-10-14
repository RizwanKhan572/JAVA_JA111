package pack2;

import pack1.One;

public class Two extends One {

    public static void main(String[] args) {

        One one =new One();
//        one.sayHi();     not available due to default access specifier.
        Two two =new Two();   // protected method available because of Inheritance.
        two.Hello();
    }
}
