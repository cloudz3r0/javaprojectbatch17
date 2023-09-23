package class15;

public class Students {
    /*
    Write a java class students that have a constructor which takes students name
    and 3 subject grades. Inside your class also have a method to calculate Average grade.
    Test student class for 2 different students with different grades.
    Should print average mark and student name
     */
   private String name;
    private double grade1;
    private double grade2;
    private double grade3;
   public Students(String cName,double math,double english,double science){
       name=cName;
       grade1=math;
       grade2=english;
       grade3=science;

   }
   public void average(){
 double avg=0;
    avg=(grade1+grade2+grade3)/3;
       System.out.println(name+" got "+avg);
     Math.round(avg);

   }
}
