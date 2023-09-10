package review3;

public class E6LogicalOperators {
    public static void main(String[] args) {
        boolean cond=true;
        System.out.println(!cond);

        boolean flag=true;
        boolean box=!flag;/*
        will reverse flag. Opposite of its true or false
        wont touch the flag variable since you didnt
        change its value. if you dont want to do the
        top part
        */
        System.out.println(box);
    }
}
