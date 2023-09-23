package class24;

import java.util.ArrayList;

public class Task4 {/*Create an array list of words. Remove any word that ends with e.
*/

    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
words.add("Milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");

        System.out.println("Before "+words);
       /* for (int i = 0; i < words.size(); i++) {

            if(words.get(i).endsWith("e")){
              words.remove(i);
            }
        }*/
        /*words.removeIf(( x)->{
                    if (x.endsWith("e")) {
                        return true;
                    } else {
                        return false;
                    }
                });*/
        words.removeIf(x->x.endsWith("e"));
        //this is making a loop behind the scenes
        //and the if condition is in the parentheses.
        System.out.println("After "+words);
    }
}
