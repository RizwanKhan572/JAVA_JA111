
public class Boxing_2 {
    public static void main(String[] args) {
        int x=10;
        // prim to wrapper
        Integer wrapper = Integer.valueOf(x); // boxing
        Integer autoBox= x;  // autoboxing

        //unboxing
        // wrapper to prim
        int primInt= wrapper.intValue(); // unboxing
        // same as

//        int primInt2=wrapperInt;  // auto unboxing
    }

}
