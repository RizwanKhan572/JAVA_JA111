

public class Immutability_8 {
  // Strings are immutable (constant,unchanged)
  public static void main(String[] args) {

      String s= "hi";
      String temp= s;
      s= s+s;

      System.out.println(temp);

      StringBuilder stringBuilder = new StringBuilder("mutable");

      stringBuilder.append("added");
      System.out.println(stringBuilder);  // it allows to change cause of StringBuilder.

      String string= "string";
      string.concat("added");
      System.out.println(string);  // it will not change due to immutability.

      // conversion from stringBuilder to string.
      stringBuilder.toString();
     // conversion from string to string builder.

      StringBuilder stringBuilder1= new StringBuilder();
      // StringBuffer --> not much in use.
      // System.out.println("a".compareTo("b")); // it compares each char by converting its ASCII value, it does a-b.
  }

  //Advantages/benefits of immutability.


}

//Disadvantages/ drawbacks of immutability.
