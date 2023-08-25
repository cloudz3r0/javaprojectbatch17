package review5;

public class loopsRecap {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {//first i is starting point
            //the second i is the amount of times you want the value printed
            //0  1  2  3  4  5. If it was i<5 it will print up to 4.
            //i++ is the increments. Goes one by one. if i+=2 or i=i+2 to go by 2. so 0 2 4.

            //code to repeat
            System.out.println("Hello");
            System.out.println(i);
        }
        for (int i = 2; i <= 10; i += 3) {//starts at 2 then goes by 3
            //2 5 8. then after is 11 but 11 is greater than 10 so loop will end since its false.
            System.out.println(i);
        }
        System.out.println("Nested Loop");
        for (int i = 1; i < 3; i++) {
            System.out.println(i);
            for (int j = 1; j <= 4; j++) {
                System.out.println("Bye");//will print bye 4 times. since the outer loop is prints 1 2.
                //bye will be printed 4 times in 1. then 4 times in 2.

            }

            }
        }
    }
