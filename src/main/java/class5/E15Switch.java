package class5;

public class E15Switch {
    public static void main(String[] args) {

            int day=5;
        //used like else if but with a few values
        //basically is else
        switch (day) {
            case 1: //is else if
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
                // need to put breaks in between statements. Will print all prints after the last break
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
//converted the last class with else if

                break;
            default:
                System.out.println("Wrong day");
                break;
        }
    }
}
