package ProblemSolving;

public class ObjectAsMethodInput_2 {

    public static void main(String[] args) {
        // Syntax: for creating obj
        // <ObjType> <objName>= new <ObjType>(passing parameter)
        Movie movie = new Movie("Raja hindustani", 4); // created movie object with type Movie obj.
        objAsInput(movie); // passing obj as parameter

        Movie movie1 =returnObj();
        System.out.println(movie1.getName());  // returned value getting here.

    }

    // not returning;
    static void objAsInput(Movie movie) {   // getting movie obj with corresponding Obj type Movie.
//        System.out.println(movie.getName());
//        System.out.println(movie.getDuration());
    }

    // returning method
     static Movie returnObj() {
        Movie movie= new Movie("Kgf",4);
        return movie;

     }

}
