package class4;

public class E6Task {
    public static void main(String[] args) {
        int age=17;
        int weight=110;
        if(age>=18) {
            System.out.println("Eligible");
            if(weight>=110){
                System.out.println("Can donate");

            }else{
                System.out.println("Cant donate");
            }
        }else{
            System.out.println("uneligible");
        }

    }
}
