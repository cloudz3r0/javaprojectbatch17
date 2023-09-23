package class23;

public class Account {
    private String name;
    final private long bankAccountNumber;
    private double balance;
    final private String userName;
    private String passWord;
    final private String accountType;
    public Account(String name, long bankAccountNumber, double balance, String userName, String passWord, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.userName = userName;
        this.passWord = passWord;
        this.accountType = accountType;
    }
    public Account(long bankAccountNumber, String userName, String passWord, String accountType) {

        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.accountType = accountType;
    }

    public Account(String userName, String passWord, long bankAccountNumber, String accountType) {

        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.accountType = accountType;
    }
    public String getName(){
        return name;
    }
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }
    void setName(String name){
        this.name=name;
    }
    String getAccountType(){
        return accountType;
    }
}


