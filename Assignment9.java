class Assignment9 {

    int accountNumber;
    String accountHolderName;
    double balance;

    static double interestRate = 5.0;

    Assignment9(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Assignment9 account1 = new Assignment9(101, "Rahul", 25000);
        Assignment9 account2 = new Assignment9(102, "Priya", 35000);
        Assignment9 account3 = new Assignment9(103, "Aman", 45000);

        System.out.println("BANK ACCOUNT DETAILS");
        System.out.println("Interest Rate Before Change: " + interestRate + "%");
        System.out.println();

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();

        Assignment9.interestRate = 7.5;

        System.out.println("\nAFTER CHANGING INTEREST RATE");
        System.out.println("New Interest Rate: " + Assignment9.interestRate + "%");
        System.out.println();

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}
