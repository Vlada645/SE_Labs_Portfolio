package pl.dmss.vmaneliuk;

import java.util.Arrays;
import java.util.List;

public class BugReport {
    // Constants for statuses to prevent typos
    public static final String STATUS_NEW = "New";
    public static final String STATUS_FIXED = "Fixed";
    public static final String STATUS_CLOSED = "Closed";

    private static final List<String> VALID_STATUSES = Arrays.asList(STATUS_NEW, STATUS_FIXED, STATUS_CLOSED);

    private String description;
    private String severity;
    private String status;

    public BugReport(String description, String severity) {
        this.description = description;
        this.severity = severity;
        this.status = STATUS_NEW;
    }

    public void updateStatus(String newStatus) {
        // Refactor: validation to ensure only correct statuses are set
        if (VALID_STATUSES.contains(newStatus)) {
            this.status = newStatus;
        }
    }

    public String getStatus() { return status; }
}
