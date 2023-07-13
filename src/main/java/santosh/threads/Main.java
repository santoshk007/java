package santosh.threads;

import java.time.Instant;

public class Main {
    public static void main(String... args) {
        // NOTES:
        // Q: Differences between "extending" and "implementing" Threads?
        // A: The major difference is that when a class extends the Thread class,
        // you cannot extend any other class, but by implementing the Runnable interface,
        // it is possible to extend from another class as well,
        // like: class MyClass extends OtherClass implements Runnable.

        ThreadExample();

        RunnableExample();

        // OUTPUT:
        // Time: 2023-07-13T18:17:51.897725100Z Output: Calling Thread Example
        // Time: 2023-07-13T18:17:51.912245Z Output: Thread Example Done
        // Time: 2023-07-13T18:17:51.912245Z Output: Calling Runnable Example
        // Time: 2023-07-13T18:17:51.912245Z Output: NewThread class thread run method called
        // Time: 2023-07-13T18:17:51.912245Z Output: Runnable Example Done
        // Time: 2023-07-13T18:17:51.912245Z Output: NewRunnable class run method called
    }

    private static void RunnableExample() {
        print("Calling Runnable Example");
        var newRunnable = new NewRunnable();
        var thread = new Thread(newRunnable);
        thread.start();

        // NOTES:
        // To avoid concurrency problems,
        // it is best to share as few attributes between threads as possible.
        // If attributes need to be shared,
        // one possible solution is to use the isAlive()
        // method of the thread to check whether the thread
        // has finished running before using any attributes that the thread can change.
        // thread.isAlive();

        print("Runnable Example Done");
    }

    private static void ThreadExample() {
        print("Calling Thread Example");
        var newThread = new NewThread();
        newThread.start();
        print("Thread Example Done");
    }

    private static void print(String value) {
        System.out.println("Time: " + Instant.now() + " Output: " + value);
    }
}
