package review11;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {


        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");//0
        fruit.add("Mango");//1
        fruit.add("Orange");//2
        fruit.add("Kiwi");//3
        fruit.add("Banana");//4
        fruit.add("Cherry");//5
        fruit.add("Apple");//6

        //fruit.replaceAll(x->"water"); will replace everything in fruit with water.
        fruit.replaceAll(x->{
            if(x.contains("a")){
                return "water";//if anything in the fruits contains "a" replace with "water"
            }else{
                return x;
            }
        });
        System.out.println(fruit);





    }
}