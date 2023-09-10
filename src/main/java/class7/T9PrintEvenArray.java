package class7;

public class T9PrintEvenArray {
    public static void main(String[] args) {

        //print only the even numbers
        int[] ages = {20, 24, 48, 69, 60};
        for (int i = 0; i < ages.length; i++) {//or can ignore the if and just put i+=2
            if (ages[i] % 2 == 0) {
                System.out.println(ages[i]);
            }
        }
    }
}
