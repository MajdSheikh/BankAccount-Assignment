public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    // Create a class member (static) that has the number of accounts created thus far
    private static int numberOfAccounts = 0;
    // Create a class member (static) that tracks the total amount of money stored in every account created
    private static double totalAmountOfMoney = 0.0;


    // a constructor that increment the account count
    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts++;
    }

    // a static method that tracks the total amount of money stored in every account created. 
    public static double totalAmountOfMoney() {
        return totalAmountOfMoney;
    }

    // static method for the account count
    public static int accountCount() {
        return numberOfAccounts;
    }


    // getter for checkingBalance
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    // getter for savingsBalance
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // a method that will allow a user to deposit money into either the checking or saving
    public void depositMoney(String account, double amount) {
        if (account.equals("saving")){ // if this account is the saving account 
            this.savingsBalance += amount; // then add the amount to the savings balance
            System.out.println("money has been added to savings account");
        }
        else {
            this.checkingBalance += amount; // if this account is the checking account, then add the amount to the checkingBalance
            System.out.println("money has been added to checking account");
        }
        totalAmountOfMoney += amount;
    }


    // a method to withdraw money from one balance
    public void withdrawMoney(String account, double amount) {
        if (account.equals("saving")){
            if (this.savingsBalance > amount) {
                this.savingsBalance -= amount;
                totalAmountOfMoney -= amount;
            }
            else {
                System.out.println("insufficient funds");
            }
        }
        else {
            if (this.checkingBalance > amount) {
                this.checkingBalance -= amount;
                totalAmountOfMoney -= amount;
            }
            else {
                System.out.println("insufficient funds");
            }
        }
    }


    public void totalMoney() {
        System.out.println("your account balance is: " + totalAmountOfMoney);
    }










}