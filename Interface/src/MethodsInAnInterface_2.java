

public class MethodsInAnInterface_2 {

    public static void main(String[] args) {
        new Dolphin().move();
    }
}
interface Animal {

    void move();   // In an Interface all the methods are by default abstract.
                  // abstract must override.
                  // final -can't not override
                  // abstract and final don't go together.
}

 abstract class Fish implements Animal {

   // void move --will come here because fish is implementing Animal.

}

class Dolphin extends Fish {

    @Override
    public void move() {
        System.out.println("dolphin swim and jump");
    }
}