package santosh.threads;

import santosh.utils.CommonUtils;

/**
 * Created: 13 July 2023
 * Commonly used Thread Methods:
 * public void run(): is used to perform action for a thread.
 * public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
 * public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
 * public void join(): waits for a thread to die.
 * public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
 * public int getPriority(): returns the priority of the thread.
 * public int setPriority(int priority): changes the priority of the thread.
 * public String getName(): returns the name of the thread.
 * public void setName(String name): changes the name of the thread.
 * public Thread currentThread(): returns the reference of currently executing thread.
 * public int getId(): returns the id of the thread.
 * public Thread.State getState(): returns the state of the thread.
 * public boolean isAlive(): tests if the thread is alive.
 * public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
 * public void suspend(): is used to suspend the thread(depricated).
 * public void resume(): is used to resume the suspended thread(depricated).
 * public void stop(): is used to stop the thread(depricated).
 * public boolean isDaemon(): tests if the thread is a daemon thread.
 * public void setDaemon(boolean b): marks the thread as daemon or user thread.
 * public void interrupt(): interrupts the thread.
 * public boolean isInterrupted(): tests if the thread has been interrupted.
 * public static boolean interrupted(): tests if the current thread has been interrupted.
 */
public class ThreadMain {
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
        CommonUtils.print("Calling Runnable Example");
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

        CommonUtils.print("Runnable Example Done");
    }

    private static void ThreadExample() {
        CommonUtils.print("Calling Thread Example");
        var newThread = new NewThread();
        newThread.start();
        CommonUtils.print("Thread Example Done");
    }
}
