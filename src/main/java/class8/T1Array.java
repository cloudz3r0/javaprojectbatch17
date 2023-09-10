package class8;

public class T1Array {
    public static void main(String[] args) {
        //count how many true values are present then print.
        boolean[] conds = {true, false, true, false, true, true};
       int count=0;
        for (int i = 0; i < conds.length; i++) {// not printing the loop just using it to count our true values

            if (conds[i]) { //booleans only use true or false then we dont need a condition
            count++;
            }
        }//need to put print out of  these brackets
        System.out.println(count);
    }
}