package class20;

public class ComputerTester {
    public static void main(String[] args) {
        Computer []arr={new Apple(),new Dell(),new HP(),new Lenovo()};
        for(Computer c:arr){
            c.Browser();
            c.speed();
            c.storage();

        }
    }
}
