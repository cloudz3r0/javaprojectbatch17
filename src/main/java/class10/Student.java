package class10;

public class Student {
    //dont need main for design until we want to execute something
    //Properties/Attributes of Object
        String name;
        int age;
        String id;

    void  study(){ //behaviour/methods/functions
        System.out.println("Studying 16 hours a day........");
    }

    public static void main(String[] args) {
       //we are creating an actual student by using the Student class
        Student adrianObj=new Student();
        adrianObj.name="Adrian";//we are assigning the values of the variables above.
        adrianObj.age=21;//see how they are purple?
        adrianObj.id="abc123";
        adrianObj.study();//will execute all code in the voids brackets.
        //scanner.nextInt();
        Student avaObj=new Student(); //creating a new student in the same class/main method
        avaObj.name="Ava";
        avaObj.age=19;
        avaObj.id="def345";
        avaObj.study();
    }


}

