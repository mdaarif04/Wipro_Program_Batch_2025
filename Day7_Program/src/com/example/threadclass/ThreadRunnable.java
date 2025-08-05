package com.example.threadclass;

//public class ThreadRunnable {
//
//}

class SharedDataa {
    int sharedValue = 0;  // Stored in Heap
}

class UsingRunnableHeap implements Runnable {

    private final SharedDataa data;
    private final String threadName;

    public UsingRunnableHeap(SharedDataa data, String name) {
        this.data = data;
        this.threadName = name;
    }

    @Override
    public void run() {
        int localValue = 0; // Stored in each thread’s own Stack

        for (int i = 0; i <= 3; i++) {
            localValue++;
            data.sharedValue++;

            System.out.println(threadName + " at i: " + i + " the localValue is: " + localValue + " and sharedValue is from: " + data.sharedValue);
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) throws InterruptedException {
    	SharedDataa data = new SharedDataa(); // Shared object in Heap

        Thread t1 = new Thread(new UsingRunnableHeap(data, "Thread 1"));
        Thread t2 = new Thread(new UsingRunnableHeap(data, "Thread 2"));

        t1.start();
        t2.start();
    }
}
