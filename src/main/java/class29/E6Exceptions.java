package class29;

public class E6Exceptions {
    public static void main(String[] args) {
        System.out.println("1");

        try{
            //place the code that might throw an exception. So this is plan A
           // System.out.println(10/0);
           // String name=null;
           // name.length();
            int []arr=new int[-5];

        }catch (ArithmeticException c){
            System.out.println("Dont divide by zero");
            //this is plan B
        }
        catch (NullPointerException e){//a single try block can have different catch blocks for different types of errors.
            System.out.println("Check if you stored the null value in the variable.");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
