import java.util.Scanner;

//In this topic I am going to take input of user by keyboard whatever user types.

public class InputTakingScanner_1 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        System.out.println(name+" "+age);

    }
}
