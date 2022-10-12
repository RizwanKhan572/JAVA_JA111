import javax.sound.midi.Soundbank;

public class UpcastingMethodCall {

    public static void main(String[] args) {
              Bike bike=new Splendor();  // Parent obj can have reference to child class then it will give child
                                           // class overridden method or  I can access child class methods and
                                           // variables as well.
              bike.run();
       // instance of
        Integer i=10;
        System.out.println(i instanceof Integer);
        System.out.println(i instanceof Object);
        System.out.println(bike instanceof Bike);
        System.out.println(bike instanceof Object);
        System.out.println(bike instanceof Splendor);

    }
}

class Bike  {
    void run() {
        System.out.println("bike runs");
    }
}

class Splendor extends Bike {

void run() {
    System.out.println("splendor runs");
};
}
