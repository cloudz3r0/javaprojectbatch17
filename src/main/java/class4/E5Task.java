package class4;

public class E5Task {
    public static void main(String[] args) {
        double mortgage = 4.5;
        int price = 50000;
        if (mortgage >= 4.5) {
            System.out.println("will not buy");
        }else{
            System.out.println("Will consider buying");
            if(price>50000) {
                System.out.println("will take out a loan");
            }else{
                System.out.println("Will pay in cash");

            }
        }

    }
}