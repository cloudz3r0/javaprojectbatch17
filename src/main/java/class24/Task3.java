package class24;

import java.util.ArrayList;

public class Task3 {/*Create an array of drinks. If the drink has the letter a or e replace it with water.
*/

    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();

        drinks.add("JaegerBomb");
drinks.add("Jack Daniels");
drinks.add("Long Island");
drinks.add("Burgundy");
        for (int i = 0; i <drinks.size() ; i++) {
        String drink=drinks.get(i);
         if(drink.contains("a")||drink.contains("e")){
             drinks.set(i,"Water");
         }
        }
        System.out.println(drinks);

    }
}


