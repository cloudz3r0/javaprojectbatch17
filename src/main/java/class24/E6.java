package class24;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
for(String x:words){
    System.out.println(x);

}
        System.out.println("=========================");
words.forEach(x-> System.out.println(x));
words.removeIf(x->x.contains("e"));
        System.out.println(words);
    }
}