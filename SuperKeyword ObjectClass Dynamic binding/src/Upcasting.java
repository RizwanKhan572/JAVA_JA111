import javax.swing.plaf.basic.BasicTreeUI;

public class Upcasting {


    public static void main(String[] args) {
        Mother mother=new Mother();
        Daughter daughter=new Daughter();


        Mother mother1=new Daughter();    // A base class variable can have subclass reference. Upcasting

    }
}

class Mother {}


class Daughter extends Mother{}