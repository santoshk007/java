package santosh.threads;

import santosh.utils.CommonUtils;

import java.time.Instant;

/**
 * Example for Runnable Class.
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        CommonUtils.print("NewRunnable class run method called");
    }
}
