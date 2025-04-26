import java.util.ArrayList;

public class Tenant {
    private User user;
    private ArrayList<RentalContract> contracts;

    public Tenant(User user) {
        this.user = user;
        this.contracts = new ArrayList<>();
    }

    public void requestCreateRentalContract(RentalContract contract) {
        contracts.add(contract);
        System.out.println("Rental contract request created.");
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        if (contracts.remove(contract)) {
            System.out.println("Rental contract request terminated.");
        } else {
            System.out.println("Contract not found.");
        }
    }

    public ArrayList<RentalContract> getContracts() {
        return contracts;
    }

    public User getUser() {
        return user;
    }
}
