package review7;

public class Interview {
    public static void main(String[] args) {
        try{

            int num =10;
            int res = 10/0;

        } catch(ArithmeticException e){
            System.out.println("My Airthmetic Exception");

        } catch(Exception e){
            System.out.println("My Exception");

        }


    }
}
