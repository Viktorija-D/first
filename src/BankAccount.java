public class BankAccount {

    private double balance;

    public void transferTo(BankAccount otherAccount, double amount){
        if (amount > balance){
            System.out.println("Not enough money on bank account to transfer");
        } else {
            otherAccount.balance = otherAccount.balance + amount;
            this.balance = this.balance - amount;
            System.out.println("You have transferred " + amount);
        }

    }

    public void printBalance(String accountName) {
        System.out.println("*** Current balance of " + accountName + ": " + balance + " ***");
    }





    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }



    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit is " + amount);
    }



    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("You cannot withdraw");
        } else {
            balance = balance - amount;
            System.out.println("You withdraw " + amount);

        }
    }



    public double getBalance() {
        return balance;
    }



    public static void main(String[] args) {
        BankAccount account= new BankAccount(100);
        BankAccount account2 = new BankAccount(50);

        account.printBalance("account");
        account.deposit(50);
        account.withdraw(30);
        account.withdraw(160);


        account.printBalance("account");
        account2.printBalance("account2");
        account2.transferTo(account, 40);



        account.printBalance("account");
        account2.printBalance("account2");

        account.transferTo(account2, 200);
        account.printBalance("account");
        System.out.println("Current balance " + account.getBalance());

    }
}
