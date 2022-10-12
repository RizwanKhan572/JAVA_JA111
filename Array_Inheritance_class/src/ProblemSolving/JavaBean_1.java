package ProblemSolving;

public class JavaBean_1 {

    // Create a JavaBean Movie: Duration: Int , Name: String
    // Create two objects in of this bean and print the values in the main

    public static void main(String[] args) {
           Movie movie1= new Movie("Krrish",3);
           Movie movie2= new Movie("Gravity",2);
//        System.out.println(movie1.getDuration());
//        System.out.println(movie2.getName());
        // 2 ways to set values
        //1.using param const.
        //2.using setter
        Movie m3= new Movie();
        m3.setDuration(5);
        m3.setName("lords of rings"); // set the name using setter
        System.out.println(m3.getName());
    }
}
