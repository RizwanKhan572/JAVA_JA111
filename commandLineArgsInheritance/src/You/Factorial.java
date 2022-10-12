package You;

public class Factorial {

    public static void main(String[] args) {
        int fact=1;
        if(args.length>2) {
            System.out.println("Output Error");
        }

        if(args.length==1) {
            int num=Integer.parseInt(args[0]);
            for (int i=1; i<=num; i++) {
                fact=fact*i;

            }
            System.out.println(fact);
        }

        if (args.length==2) {
            int num=Math.abs(Integer.parseInt(args[1])-Integer.parseInt(args[0]));
            for (int i=1; i<=num; i++) {
                fact=fact*i;

            }
            System.out.println(fact);
        }
    }
}
