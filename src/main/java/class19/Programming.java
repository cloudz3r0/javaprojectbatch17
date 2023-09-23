package class19;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class, if
    nothings pass to it then the message "I love programming languages" should be
    printed. If some string is passed to it then in place of programming languages,
    string should be printed instead.
     */


public Programming(){
    System.out.println("I love programming languages");

    }
    public Programming(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
       new Programming();//with constructors, we don't need to use a variable
        //since there are no methods
        new Programming("Java");

    }
}
