public class TestBankAccount {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();

        BankAccount.accountCount();

        account1.depositMoney("saving", 70.0);
        account1.depositMoney("checking", 70.0);
        account1.withdrawMoney("saving", 50.0);
        account1.withdrawMoney("checking", 50.0);


        System.out.println("There are " + BankAccount.accountCount() + " accounts");
        System.out.println("There is " + BankAccount.totalAmountOfMoney() + "$");

    }
}