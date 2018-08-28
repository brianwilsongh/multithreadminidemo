package io.github.wilsontheory;

import java.util.concurrent.CountDownLatch;

public class ObjectAlterationThread implements Runnable {

    private int seedNumber;
    private CountDownLatch latch;

    public ObjectAlterationThread(int seedNumber, CountDownLatch latch){
        this.seedNumber = seedNumber;
        this.latch = latch;
    }
    @Override
    public void run() {
        try {
//            Thread.sleep(100);
//            int x = (523423413 % 32);
//            int y = (261114124 % 14);
//            int z = (253025323 % 23);
        } catch (Exception e){
            e.printStackTrace();
        }
        UtilityClass.append(seedNumber);
        latch.countDown();
    }
}
