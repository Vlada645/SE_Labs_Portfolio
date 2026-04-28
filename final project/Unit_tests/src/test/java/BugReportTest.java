import org.junit.jupiter.api.Test;
import pl.dmss.vmaneliuk.BugReport;

import static org.junit.Assert.assertEquals;

public class BugReportTest {
    @Test
    public void testInitialStatus() {
        BugReport report = new BugReport("Graphics glitch", "High");

        assertEquals("New", report.getStatus(), "New");
    }

    @Test
    public void testStatusTransition() {
        BugReport report = new BugReport("Server crash", "Critical");

        report.updateStatus("Fixed");

        assertEquals("Fixed", report.getStatus());
    }
}
