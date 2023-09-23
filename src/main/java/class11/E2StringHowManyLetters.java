package class11;

public class E2StringHowManyLetters {
    public static void main(String[] args) {
        //write code to see how many times letter a has appeared.
        //String
        int count = 0;

        String str = "Batch 17 is A great batch.";

        for (int i = 0; i < str.length(); i++) {//not using -1 bc we're not using <= sign.

            if (str.charAt(i)=='a'||str.charAt(i)=='A') {//if the value of i has an A in it.
//so the i will be the index and will go through each number.0 is B, 1 is A. etc.

                count++;//keep running through all the index spaces in the string to find A.Increase count when
                //an A is found
            }
        }
        System.out.println(count);//must put here to get out of loop
    }
}
