package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {

        double accountBalance=70000;


        if(accountBalance>28000) { //so if the value is above 50000 it will print both lines
            System.out.println("We can afford a normal toyota");
            if(accountBalance>50000){
                System.out.println("We can afford luxury as well");
            }

        }else {
            System.out.println("we need to save more");

        }
    }
}
