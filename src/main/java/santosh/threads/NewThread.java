package santosh.threads;

import santosh.utils.CommonUtils;

import java.time.Instant;

/**
 * Example for extending the Thread Class.
 */
public class NewThread extends Thread {

    @Override
    public void run() {
        CommonUtils.print("NewThread class thread run method called");
    }
}
