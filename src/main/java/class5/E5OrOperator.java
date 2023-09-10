package class5;

public class E5OrOperator {
    public static void main(String[] args) {
       boolean broughtFlowers=true;
       boolean broughtChocolates=false;
       boolean allMyMistake=true;
       // combines all conditions. If one condition is true it will make the if true
       if(broughtChocolates||broughtFlowers||allMyMistake) {
           System.out.println("Wife is happy");
       }else{
           System.out.println("wife is sad");
       }
       }

}
