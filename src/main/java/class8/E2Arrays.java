package class8;

public class E2Arrays {
    public static void main(String[] args) {


        boolean[] conds = {true, false, true, false, true, true};

        int i = 0;
        while (i < conds.length) {//will get an error if trying to use <=. will try to print a value that
            //is larger than the capacity. for example after printing the 6th number it will try to print 7
            System.out.println(conds[i]);
            i++;
        }
    }
}