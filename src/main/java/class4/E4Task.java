package class4;

public class E4Task {
    public static void main(String[] args) {
        boolean diploma=true;//if this is false it will print you should get a degree
        double gpa=3.5;
        /*if diploma is true but gpa is lower than 3.5 then it will print
        Congratulations and you should have studied harder.
         */
        if(diploma==true){
            System.out.println("Congratulations");
            if(gpa>=3.5) {
                System.out.println("You get a scholarship");

            }else {
                System.out.println("you should have studied harder");

              }
            }else{
                System.out.println("You should get a degree");
            }
        }
    }

