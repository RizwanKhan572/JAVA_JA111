public class CommandLineArgs {

    public static void main(String[] args) {

        for (String s:args
             ) {
            System.out.println(Integer.parseInt(s)*3);
        }
    }

    // for converting str to num 2 ways
    // 1.Integer.valueOf
    // 2.Integer.parseInt
}
