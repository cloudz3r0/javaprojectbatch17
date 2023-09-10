package class4;

import java.util.Scanner;

public class E14HwFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String city="Rockville";
        int degrees=82;
      int degrees2=(degrees-32)*5/9;
        System.out.println("The temperature in rockville is "+degrees2+"°C");
    }
}
