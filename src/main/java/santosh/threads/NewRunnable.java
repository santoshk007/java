package santosh.threads;

import java.time.Instant;

/**
 * Example for Runnable Class.
 */
public class NewRunnable implements Runnable{
    @Override
    public void run() {

        print("NewRunnable class run method called");
    }

    private void print(String value) {
        System.out.println("Time: " + Instant.now() + " Output: " + value);
    }
}
