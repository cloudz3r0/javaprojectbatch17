package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class T2Countries {
    /*
    Create a map of countries(5) with its capital that will store
    countries in alphabetical order. Country names will be keys and capitals will be values
    Print all keys and values from map with for loop
    Print all values from the map with Lambda
    Only print those countries which contain more than 5 letters in country name

     */
    public static void main(String[] args) {


        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA","D.C.");
        countries.put("Colombia","Bogota");
        countries.put("Mexico","Mexico City");
        countries.put("France","Paris");
        countries.put("Spain","Madrid");

        Set<Map.Entry<String,String>> entries=countries.entrySet();
        for(Map.Entry<String,String> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("==========");
        countries.forEach((k,v)-> System.out.println(v));
        System.out.println("===========");
        countries.forEach((k,v)-> {
            if(k.length()>5){
                System.out.println(k+" "+v);
            }
        });
        System.out.println("========");
        countries.forEach((k,v)->{
            if (k.length()>5&&v.contains("a")){
                System.out.println(k+" "+v);

            }
        });
    }
}
