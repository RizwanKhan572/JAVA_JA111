import com.sun.tools.jconsole.JConsolePlugin;

public class WeProblem_3 {

    // create an interface Printer : print();
    // create a concrete class FilePrinter
    // create a concrete class ConsolePrinter
    public static void main(String[] args) {
        FilePrinter filePrinter=new FilePrinter();
        filePrinter.print();
        ConsolePrinter consolePrinter=new ConsolePrinter();
        consolePrinter.print();
    }



}

interface Printer {

    void print();

}

  class FilePrinter implements Printer {
    @Override
     public void print() {
        System.out.println("FilePrinter");
    }
}

class ConsolePrinter implements Printer {

    @Override
    public void print() {
        System.out.println("ConsolePrinter");
    }
}