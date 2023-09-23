package class14;

public class BankAccount {
   private String name="Adrian";
    private String userName="Adrian123";
    private String password="pass123";
   public double accountBalance=-300;
    String accountNumber="12345";
    void printInfo(){
        System.out.println("I am Adrian From Batch17");
    }
     void printCity(){
        System.out.println("Rockville");
    }


    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
    }
}
