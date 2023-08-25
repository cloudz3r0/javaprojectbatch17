package class8;

public class E1Arrays {
    public static void main(String[] args)  {
//print the array in reverse order
    char [] chars={'A','b','c','F','E','#','@'};

    for (int i = chars.length-1; i>=0;i--){//start with place of symbol.@ is the 6th number in array.
        System.out.println(chars[i]);// bc we have 7 numbers but the 7th is the 6th number. gotta subtract 1
    }


    }
}
