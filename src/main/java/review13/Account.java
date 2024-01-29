package review13;

public class Account {
    private  double accountBalance;
    Account(double accountBalance){
        this.accountBalance=accountBalance;

    }

    void transferFunds(double amount)throws InsufficientFundsException{
        if(amount>accountBalance){
            throw new InsufficientFundsException("You dont have enough funds");
        }

    }
}
class AccountTester{
    public static void main(String[] args) throws InsufficientFundsException {
        Account account=new Account(100);
        account.transferFunds(120000);
    }
}