package class2;

public class E8StringConcat {
    public static void main(String[] args) {
//cant use string for subtract multiply or divide. Can only add because it concatenates with string
        String msg="My Age is ";
        int age=20;
        String result=msg+age;
        System.out.println(result);
        System.out.println("a string"+10+10);//This will just make it a string 1010
        System.out.println("a string"+ (10+10));//This will make the numbers add
        System.out.println(2+2*2);//2*2 will take priority first.answer will be 6
        System.out.println((2+2)*2);//8
        System.out.println("10"+10);//1010
        System.out.println("10"+10+10);//101010
        System.out.println("10"+(10+10));//1020
        System.out.println("10"+10*10);//10100




    }
}
