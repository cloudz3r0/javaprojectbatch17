package class29;

public class E3Exceptions {
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println(10/0);//error happens since 10 cant be divided by 0.But this is am exception
        // so it lets the code before it run but not the code after
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
    }
}
