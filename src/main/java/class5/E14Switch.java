package class5;

public class E14Switch {
    public static void main(String[] args) {
        int day=5;
        switch (day){//used like else if but with a few values
         //switch cant use long float double or boolean
         //cant use > <
         //only for equality purposes
            case 1://is else if
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;// need to put breaks in between statements. Will print all prints after the last break
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

                default://basically is else
                System.out.println("Wrong day");
        }
    }
}
