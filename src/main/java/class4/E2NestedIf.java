package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = true;//if theres false in here then it will print only the last else
        String jacketColor = "Black";//if i put a diff value then the second line wont print.
//if you do this everything needs to be true to be able to print.
        if (winter == true) {
            System.out.println("Its very cold");//this executes cuz if is true
            if (jacketColor.equals("Red")) {
                System.out.println("lets go with red today");
            }else {
                System.out.println("lets go with the blue ones");
            }
        } else {
            System.out.println(" No need to wear jackets");
        }
    }
}
//if there's two ifs you need 4 curly brackets at the end
//you can use debug by pressing on a line and making a red circle. Can tell u what gets printed