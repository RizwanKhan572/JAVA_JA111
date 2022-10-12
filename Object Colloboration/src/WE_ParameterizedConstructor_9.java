public class WE_ParameterizedConstructor_9 {

    public static void main(String[] args) {
        Movie movie= new Movie(9,2011,"lagaan");
        System.out.println(movie.movieName+movie.songs+movie.year);
    }
}

class Movie {
  int songs;
  int year;
    String movieName;
    //default constructor
    Movie() {
        System.out.println("");
    }
    Movie(int s,int y, String  n) {

     songs=s;
     year=y;
     movieName=n;
    }
}