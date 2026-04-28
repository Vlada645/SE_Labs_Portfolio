package pl.dmss.vmaneliuk;

/**
 * Represents a bug report in the GameStore Hub system.
 * Implements the logic shown in the Bug Reporting Sequence Diagram.
 */
public class BugReport {
    private String description;
    private String severity;
    private String status;

    public BugReport(String description, String severity) {
        this.description = description;
        this.severity = severity;
        this.status = "New"; // Default status as per system requirements
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }
}
