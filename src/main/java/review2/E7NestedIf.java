package review2;

public class E7NestedIf {
    public static void main(String[] args) {
        String day="Sunday";
        double accountBalance=5000;
        if (day.equals("Sunday")) {
            System.out.println("Lets go shopping its sunday");
            //== equals() != !equals
            System.out.println("");
            if (accountBalance > 2000) {
                System.out.println("We can buy this");
            } else {
                System.out.println("Its too expensive");
            }
        }else if(day.equals("Saturday")){
            System.out.println("Its saturday lets go for dinner");

        }else{
            System.out.println("Lets wait for sunday");
        }
    }
}
