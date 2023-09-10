package review3;

public class E2OROperator {
    public static void main(String[] args) {
        boolean meat=false;
        boolean egg=true;
        boolean fish=false;
        //if im eating any of these im eating good sources of protein
        // only one has to be true or "eaten"
       boolean milk=true;
       boolean veggies=true;
       boolean fruit=true;
        boolean isProtein=meat||egg||fish;
        boolean goodDiet=(egg||meat||fish)&&milk&&veggies&&fruit;/*
        if i dont eat one of the 3 in the & variable i dont get all my nutrients
        If one is false then it'll all be false
        */
       /*need to add milk veggies and fruits to get all nutrients needed with
        a good source of protein*/
        System.out.println(isProtein);
        System.out.println(goodDiet);

    }
}
