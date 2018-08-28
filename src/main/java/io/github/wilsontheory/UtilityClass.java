package io.github.wilsontheory;

public class UtilityClass {
//    public static StringBuilder mutableThing = new StringBuilder();
    public static Integer[] mutableThing = new Integer[5];

    static synchronized void append(int i){
//        mutableThing.append(i);
        mutableThing[i - 1] = i;
    }

}
