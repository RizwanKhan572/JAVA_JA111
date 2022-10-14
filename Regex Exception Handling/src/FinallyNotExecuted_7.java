public class FinallyNotExecuted_7 {

    public static void main(String[] args) {

        try {
            System.out.println("try");
            System.exit(1);
        }
        finally {
            System.out.println("finally");
        }
    }
    // finally block will not execute due to when jvm runs out of
    // memory when our java process is killed forcefully by task manager or console when
    // our machine shuts down due to power failure and deadlock condition in our try block
}
