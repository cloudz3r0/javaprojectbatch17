package class5;

public class E9ANDOperator {
    public static void main(String[] args) {
        //write a program that decides many factors into getting a loan to be needed

        boolean goodCredit=true;
        boolean stableJob=true;
        boolean minimumAge=true;
        if(goodCredit&&stableJob&&minimumAge){
            System.out.println("You can get a loan");

        }else {
            System.out.println("You need to fulfill the requirements");
        }
    }
}
