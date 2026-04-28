package pl.dmss.vmaneliuk;

/**
 * Bug reporting logic as specified in the Sequence Diagram[cite: 99, 182].
 */
public class BugReport {
    private String status = "New";

    public void updateStatus(String newStatus) {
        // Updates status: New -> Verified -> Fixed -> Closed [cite: 204]
        this.status = newStatus;
    }

    public String getStatus() { return status; }
}
