package santosh.threads;

import java.time.Instant;

/**
 * Example for extending the Thread Class.
 */
public class NewThread extends Thread {

    @Override
    public void run() {
        print("NewThread class thread run method called");
    }

    private void print(String value) {
        System.out.println("Time: " + Instant.now() + " Output: " + value);
    }
}
