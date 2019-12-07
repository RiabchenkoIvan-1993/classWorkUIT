package com.company;

import static java.lang.System.out;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            Thread thread = Thread.currentThread();
            out.println("ID = " + thread.getId());
            out.println("Name = " + thread.getName());
            out.println("Priority = " + thread.getPriority());
            out.println("State = " + thread.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
