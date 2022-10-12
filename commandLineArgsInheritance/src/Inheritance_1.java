public class Inheritance_1 {

    public static void main(String[] args) {

        Fish fish= new Fish();
        Dolphin dolphin=new Dolphin();
        dolphin.swim();
        dolphin.jump();

    }
}

 class Fish {   // parent class or super class or base class

    void swim() {   // method inside parent class
        System.out.println("Fish is Swimming");
    }
 }


 class Dolphin extends Fish {    // child class or subclass or derived class


     @Override
     void swim() {
         System.out.println("Dolphin can swim");
     }

     void jump() {
        System.out.println("dolphin can jump");
    }

 }