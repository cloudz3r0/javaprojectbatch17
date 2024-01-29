package review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println(1);
        System.out.println(2);
        try {


            FileInputStream fileInputStream = new FileInputStream("sjndjs");}//run code then click the exception after exception in thread "main" java.io.
        catch(FileNotFoundException f){
            System.out.println("This line didnt work");
            //System.out.println(f.getMessage());
           // System.out.println(f);
            f.printStackTrace();
        }
        System.out.println(3);
        System.out.println(4);
        //will tell you why theres an error.
    }
}
