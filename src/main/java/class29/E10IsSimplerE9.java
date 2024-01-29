package class29;

import java.io.FileInputStream;
import java.io.IOException;

public class E10IsSimplerE9 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Book1.xlsx")) {


        } catch (IOException e) {
            System.out.println("Please check the file path");
        }
    }
}
