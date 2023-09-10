package class6;

public class E8WhileExclude7 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i != 7) { // if there's a 7. it won't print
                System.out.println(i);
               //if i put i++ here it will print up to 6 since it said no to 7
            }
            i++;// have to put this under curly bracket for if to print out all numbers

        }
    }
}
