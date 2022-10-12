public class Overriding {

    public static void main(String[] args) {

        You you=new You();
        you.earn();
    }


}

class Father {

    void earn() {
        System.out.println("Earned from a business");
    }
}

class You extends Father {
    // Rules of Overriding-->
    // 1.There should be is-a relation.
    // 2.Method name should be same across parent and child class.
    // 3.args list of both method should be same.

    @Override
    void earn() {

        System.out.println("Earned from a job");
    }
}
