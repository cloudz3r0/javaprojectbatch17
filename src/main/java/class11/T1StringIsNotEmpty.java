package class11;

public class T1StringIsNotEmpty {
    public static void main(String[] args) {
        /*create a string and if the string is not empty perform the following
        If the string has an odd number of characters and has 3 or more characters, print the character in
        the middle of string.
         */
        String str="Hello MyFriends";
        if(str.isEmpty()){//we dont really need this bc the >=3 checks if our string has atleast
            //3 characters.
            System.out.println("Empty");
        }else{
            if(str.length()%2!=0&&str.length()>=3){//checks for 3 characters not 3 index. So not 4 letters
                //So Hel will be true and printed. He wont.
            int middle=str.length()/2;//to find middle character.
                System.out.println(str.charAt(7));//will pull the character in index 7.
                System.out.println(str.length());//will be 15 because string length tells you how many
                //characters there are and doesnt go by index
            }
        }
    }
}
