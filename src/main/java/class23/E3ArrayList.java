package class23;


import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();

        String str="adrian";
        arr.add(str);
        arr.add("Hello");
        Integer i=new Integer(22);
        arr.add(i);
   checkPrint(arr);

    }
  static  void checkPrint(ArrayList arr){
        for(Object a:arr){
            String str=(String)a;
            System.out.println(str.length());
        }
    }
}
