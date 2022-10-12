public class InterfaceDemo_1 {

// abstraction percentages
    /*
    1.interface--> 100% abstraction (before java 8) by default all methods are abstract.
    2.abstract class--> partial abstraction(can have abstract method as well as concrete method).
    3.concrete class--> 0% abstraction (because of only concrete methods are allowed).
     */
    public static void main(String[] args) {
        StudentsOfMasai students=new StudentsOfMasai();
        System.out.println(MasaiStudentContract.fee);

    }
}
interface MasaiStudentContract {
    double fee=0;   // it will be by default <public static final> because it is inside an interface.
}

class StudentsOfMasai implements MasaiStudentContract {


}
