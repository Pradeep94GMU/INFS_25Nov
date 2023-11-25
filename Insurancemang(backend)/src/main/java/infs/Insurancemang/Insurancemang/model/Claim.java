package infs.Insurancemang.Insurancemang.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "claims")
public class Claim {

    @Id
    private String id;
    private String policyId; // to link with Policy
    private String customerId; // to link with Customer
    private Date dateOfClaim;
    private double claimAmount;
    private String status; // e.g., filed, in_review, paid, denied

    public Claim() {
    }

    public Claim(String id, String policyId, String customerId, Date dateOfClaim, double claimAmount, String status) {
        this.id = id;
        this.policyId = policyId;
        this.customerId = customerId;
        this.dateOfClaim = dateOfClaim;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(Date dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id='" + id + '\'' +
                ", policyId='" + policyId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", dateOfClaim=" + dateOfClaim +
                ", claimAmount=" + claimAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
