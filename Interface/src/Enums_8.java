public class Enums_8 {

    public static void main(String[] args) {
        Directions direction1;
        direction1=Directions.EAST;
        Directions directions2=Directions.WEST;
        System.out.println(direction1);
        Color color1=Color.BLUE;
        System.out.println(color1);
        System.out.println(direction1==Directions.EAST);
    }
}

enum Directions{
    EAST,WEST,NORTH,SOUTH;
}

enum Color {
    RED,
    GREEN,
    BLUE,
    QUEEN_BLUE;
}

enum Day {
    MONDAY,
    SUNDAY,
    TUESDAY;

}
/*
final class Directions {
    public static final Directions EAST = new Directions();
    public static final Directions WEST = new Directions();
    public static final Directions NORTH = new Directions();
    public static final Directions SOUTH = new Directions();
}
 */


