package class9;

public class T32dArraysGrades {
    public static void main(String[] args) {

        String[][] students = {
                {"Adrian", "Nero", "Ava", "Cloud"},
                {"A", "B", "C", "D"}
        };
        for (int i = 0; i < students[0].length; i++) {//the 0 makes the length 4 rows.Without the 0 it would only print 2
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i]);}//prints out adrian and nero because they have A and b
            //Adrian = 0 A =0 Nero=1 B=1

            }
        }
    }


    
    
            
    

