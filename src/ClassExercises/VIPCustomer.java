package ClassExercises;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VIPCustomer(String name, int creditLimit) {
        this(name, creditLimit, "No Email Provided");
    }

    public VIPCustomer() {
        this("No Name Provided", 10000, "No Email Provided");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
