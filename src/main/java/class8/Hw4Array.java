package class8;

public class Hw4Array {
    public static void main(String[] args) {

       // Create an array of animals and store 5 elements
        // Using 2 different loops print all values from the array.
String []animals={"Tiger","Cat","Dog","Lion","Human"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);

            }
            for(String n:animals){
                System.out.println(n);
        }
    }
}
