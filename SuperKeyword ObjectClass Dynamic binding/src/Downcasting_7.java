public class Downcasting_7 {

    public static void main(String[] args) {
          Dog dog=new Dog();
          dog.eat();
    }

}

class Animals  {

   void eat() {
       System.out.println("Animals eat");
   }
}

class Cow extends Animals {

    @Override
    void eat() {
        System.out.println("Cow eats");
    }

    void speak() {
        System.out.println("moo");
    }
}

