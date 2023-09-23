package class13;
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class Students {
static int numbersOfStudents=0;
    String name;
int id;
Students(String studentName, int studentID) {
    name = studentName;
    id = studentID;
numbersOfStudents++;
}
public static void main(String[] args) {
    Students student1=new Students("Adrian",109873);
    Students student2=new Students("Ava",197623);
    Students student3=new Students("Steven",197663);
    System.out.println("Total students: "+numbersOfStudents);
//can also do the long way like this without the Students method
    /*

    Students student1=new Students();
    student1.name="name";
    student1.id="idNumber";
    Students student2=new Students();
    student2.name="name";
    student2.id="idNumber";
     */

    }
}
