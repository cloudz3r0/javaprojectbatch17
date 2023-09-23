package class17;

public class MultiLevelTesterA {
    public static void main(String[] args) {
        C c=new C();
        c.printName();//this is from Class A
        c.printColor();//this is from Class B
        c.printNameColor();
    }
}
