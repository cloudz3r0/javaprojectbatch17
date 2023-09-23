package class23;



public class BankAccountTester {
    public static void main(String[] args) {
        Account b=new Account(12984,"USername",
                "Pass123","Savings");
        System.out.println(b.getBankAccountNumber());
        System.out.println(b.getName());
        b.setName("Ava");
        System.out.println(b.getName());
    }
}
