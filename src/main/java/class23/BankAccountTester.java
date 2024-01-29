package class23;



public class BankAccountTester {
    public static void main(String[] args) {
        Account b=new Account("Adrian",12984,60.0,"USername",
                "Pass123","Savings");
        System.out.println(b.getBankAccountNumber());
        System.out.println(b.getName());
        b.setName("Ava");
        System.out.println(b.getName());
    }
}
