package class7;

public class T10AddArray {
    public static void main(String[] args) {

//add all numbers in array and print the sum. should print 150
        int[] ages = {20, 10, 50, 30, 40};
int sum=0;// needs to be zero. bottom explains why.
        for (int i = 0; i <ages.length ; i++) {
            sum=sum+ages[i];//pick the previous value of sum and add it to current value of array
            //starts at 0+20 then 20+10 then 30+50 then 80+30 then 110+40 =150
            System.out.println(sum);

            //can also do sout("the sum is "+(ages[0]+ages[1]+ages[2]+ages[3]+ages[4]));
            //or just make an int sum;
           // sum=ages[0]+ages[1]+ages[2]+ages[3]+ages[4];
        }



        }
    }

