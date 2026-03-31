package Strings;

import java.util.concurrent.atomic.AtomicInteger;

public class StringThread {
    public static void main(String[] args) throws InterruptedException {

        StringBuffer builder = new StringBuffer("");
       // AtomicInteger count= new AtomicInteger();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                builder.append("a");
               // count.getAndIncrement();
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                builder.append("a");
//                count.getAndIncrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(builder.length());

    }
}
