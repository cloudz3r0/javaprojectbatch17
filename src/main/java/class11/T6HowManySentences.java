package class11;

public class T6HowManySentences {
    public static void main(String[] args) {
        /*
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
         */
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] a1=a.split("[?]");
        System.out.println(a1.length);
        System.out.println("There are "+a1.length+" sentences.");
    }
}
