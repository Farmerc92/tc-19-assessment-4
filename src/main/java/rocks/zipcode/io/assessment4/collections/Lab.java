package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    private String name;
    private LabStatus status;

    public Lab() {
        this("");
    }

    public Lab(String labName) {
        this.name = labName;
        status = LabStatus.PENDING;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        status = labStatus;
    }

    public LabStatus getStatus() {
        return status;
    }
}
