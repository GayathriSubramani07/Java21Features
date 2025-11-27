package com.demo;

public class VirtualThread {

    // Before Java 21 — Platform Threads (Traditional)
    public static void beforeJava21() {
        Thread[] threads = new Thread[3];

        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Running task on: " + Thread.currentThread());
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Java 21 — Virtual Threads (Project Loom)
    public static void java21Version() {
        Thread[] threads = new Thread[3];

        for (int i = 0; i < 3; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                System.out.println("Running task on: " + Thread.currentThread());
            });
        }

        // Wait for all virtual threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //  Main method
    public static void main(String[] args) {
        System.out.println("----- Before Java 21 (Platform Threads) -----");
        beforeJava21();

        System.out.println("\n----- In Java 21 (Virtual Threads) -----");
        java21Version();
    }
}



// ----- Before Java 21 (Platform Threads) -----
// Running task on: Thread[#21, Thread-0,5,main]
// Running task on: Thread[#22, Thread-1,5,main]
// Running task on: Thread[#23, Thread-2,5,main]

// ----- In Java 21 (Virtual Threads) -----
// Running task on: VirtualThread[#24]/runnable
// Running task on: VirtualThread[#25]/runnable
// Running task on: VirtualThread[#26]/runnable

