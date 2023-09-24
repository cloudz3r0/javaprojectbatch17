package class26;

import java.util.LinkedHashMap;

public class T3 {/*
Create a map of a bestBuy store. Place
item id and item name in it
example 89877=Printer
Retrieve all keys and values from a best buy map using entryset
*/

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> bestBuy=new LinkedHashMap<>();
        bestBuy.put(83263,"Printer");
        bestBuy.put(19773,"Newest Tv");
        bestBuy.put(78655,"Monitor");
        bestBuy.put(976363,"Gaming laptop");
        var entries=bestBuy.entrySet();
        for(var e:entries){
            System.out.println(e);
        }
        System.out.println("=========");
        bestBuy.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
