

//Final keyword uses.
/*
1.if a variable is final its value can not be changed.
2.if a method is final it can not be overridden.
3.if a class is final it can not be extended.
 */

public class FinalKeyword_1 {

    public static void main(String[] args) {
        A parent=new B();
         B child =(B)parent;
         child.value(9);
    }

}

class A {

    final void funA() {          // final keyword doesn't allow override;
        System.out.println();
    }

    final void value(int a) {
        System.out.println(a+1);
    }
}

class B extends A {

//    void funA() {   // can not be overridden because of final keyword.
//
//    }

    void value(String s) {     // overloading is allowed.

        System.out.println(s);
    }


}




