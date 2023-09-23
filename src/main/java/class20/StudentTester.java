package class20;

public class StudentTester {
    public static void main(String[] args) {
        Student [] arr={new Student(),new SyntaxStudent(),new CollegeStudent()};
        for (Student s:arr) {
            s.Learn();
            s.Mental();
            s.School();
        }
    }
}
