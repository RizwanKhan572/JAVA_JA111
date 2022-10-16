
// need to see Arjun's repo day14 WE_problem

public class WEProblem_3 {

    // create some plant objects
    // add them to a list
    // print plant color and name

    public static void main(String[] args) {
        Plant snakePlant = new Plant();


    }

}

class Plant {
   String color;
   double height;

   void Plant(double height,String color) {
        this.height= height;
        this.color=color;
        System.out.println(this.height+"--->"+this.color);
    }

}
