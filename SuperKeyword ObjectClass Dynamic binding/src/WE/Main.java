package WE;

public class Main {

    public static void main(String[] args) {
       HDFCBank hdfcBank=new HDFCBank();
        System.out.println(hdfcBank.getROI(10));
        SBIBank sbiBank=new SBIBank();
        System.out.println(sbiBank.getROI(30));
    }
}

 class  RBIBank {

    int getROI(int n) {
        return 0;
    }
 }

 class  HDFCBank extends RBIBank {
    @Override
    int getROI(int n) {
        return n*2;
    }
 }


class  SBIBank extends RBIBank {
    @Override
    int getROI(int n) {
        return n+n;
    }
}