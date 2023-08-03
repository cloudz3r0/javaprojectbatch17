package class1;

import java.sql.SQLOutput;

public class E4DataTypes { //PascalCase for class name

    public static void main(String[] args) {
        //byte can store up to -128 to 127
        // short is used for bigger numbers -32768 to 32767
        //int -2147483648 to 2147483647
        //long is used for numbers bigger than int.
        //put L next to long number if it has red line under it
        //sout then (variable name) to print
        byte age=127;
        short iphonePrice=1099; //pascalCase for variable names
        int bankBalance=3200000;
        long distance= 1122222236564534L;

        System.out.println(age);
        System.out.println(iphonePrice);
        System.out.println(bankBalance);
        System.out.println(distance);

    }
}
