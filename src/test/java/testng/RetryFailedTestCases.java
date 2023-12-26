package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import static com.epam.jdi.light.settings.WebSettings.logger;

public class RetryFailedTestCases implements IRetryAnalyzer {
    private int retryCnt = 0;

    // This method will be called everytime a test fails.
    // It will return TRUE if a test fails and need to be retried, else it returns FALSE
    public boolean retry(ITestResult result) {
        // You could mention maxRetryCnt (Maximiun Retry Count) as per your requirement.
        // Here I took 2, If any failed testcases then it runs two times
        int maxRetryCnt = 1;
        if (retryCnt < maxRetryCnt) {
            logger.info("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
            retryCnt++;
            return true;
        }
        return false;
    }

}

