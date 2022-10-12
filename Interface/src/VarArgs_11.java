

public class VarArgs_11 {

    void print(int i) {
        System.out.println(i);
    }

    void print(int i,int j) {
        System.out.println(i+" "+j);
    }

    void print(Integer... integers) {
        for (Integer i:integers
             ) {
            System.out.println(integers+" ");
        }
    }

    public static void main(String[] args) {
       VarArgs_11 varArgs_11=new VarArgs_11();
       varArgs_11.print(1,2,3);
    }
}
