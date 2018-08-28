package io.github.wilsontheory;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class App
{
    public static void main( String[] args )
    {
        CountDownLatch latch = new CountDownLatch(5);

        Thread t = new Thread(new ObjectAlterationThread(1, latch));
        Thread t2 = new Thread(new ObjectAlterationThread(2, latch));
        Thread t3 = new Thread(new ObjectAlterationThread(3, latch));
        Thread t4 = new Thread(new ObjectAlterationThread(4, latch));
        Thread t5 = new Thread(new ObjectAlterationThread(5, latch));
        try {
            t.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            latch.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

//        System.out.println(UtilityClass.mutableThing.toString());
        System.out.println(Arrays.toString(UtilityClass.mutableThing));
    }
}
