public class Polymorphism_6 {

    public static void main(String[] args) {

        Sum sum=new Sum();
        System.out.println(sum.add(5,3));
    }

}

// static binding,compile time polymorphism,method overloading.
class Sum {

    int add(int x, int y) {
        return x+y;
    }

    String add(int x,int y, int z) {

        return "x+y+z";
    }
}

// Rules-->
// 1.return type can be same or diff.
// 2.args should be different.

