public class RentalContract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    private boolean isActive;

    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
        this.isActive = true;
    }

    public void createContract() {
        this.isActive = true;
        System.out.println("Rental contract has been created.");
    }

    public void terminateContract() {
        this.isActive = false;
        System.out.println("Rental contract has been terminated.");
    }

    
    public String getContractID() {
        return contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public boolean isActive() {
        return isActive;
    }
}
