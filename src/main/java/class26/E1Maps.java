package class26;



import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",8.0);
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("Kiwi",8.0);
        fruit.put("Apple",4.0);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(44));

//Order is not contained here. And since its hash theres no duplicate 1st values.
        //The apple is being overrided with the second value. Since its Apple=8.0 then becomes Apple=4.0;
        }
    }

