package ClassExercises;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerPhone) {
        this(accountNumber, accountBalance, customerName, "Email Not Provided", customerPhone);
    }

    public BankAccount() {
        this(999999999, 0, "Name Not Provided", "Email Not Provided", "Phone Not Provided");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " Processed.");
        System.out.println("New Account Balance for " + this.customerName + " is $" + this.accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Withdrawal Not Processed.");
            System.out.println("Available Funds for " + this.customerName + " is $" + this.accountBalance);
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " Processed.");
            System.out.println("Remaining Funds for " + this.customerName + " is $" + this.accountBalance);
        }
    }
}
