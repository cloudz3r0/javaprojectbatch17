package class7;

public class E10Array {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Orange", "Banana", "Kiwi", "Pineapple"};
        fruit[3] = "Mango";

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}

