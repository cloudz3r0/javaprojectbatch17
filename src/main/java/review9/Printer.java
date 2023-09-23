package review9;

public class Printer {
   void print() {
        System.out.println("Hello");
    }

void print(int ...arr){//variable arguments. unlimted parameters. Acts as an array
   for(int num:arr){

   }
}
   void print(String n) {
        System.out.println(n);
    }
   void print(String n,int num){
        System.out.println(n+num);
    }
   void print(int num,String word){
        System.out.println(num+word);
    }

    public static void main(String[] args) {

    }
}

