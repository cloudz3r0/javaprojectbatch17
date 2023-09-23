package class19;
   /*
    Create a class CreditCard Create an instance method that will calculate
interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes
    */

public class CreditCard {
    public void calInterest(double balance){
        System.out.println(balance*0.5);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{


    @Override
    public void calInterest(double balance){
        System.out.println(balance*0.7);
    }
}
class Test {
    public static void main(String[] args) {

        CreditCard c = new CreditCard();
        c.calInterest(100);
        Visa v=new Visa();
        v.calInterest(100);
        AX ax=new AX();
        ax.calInterest(100);

    }
}