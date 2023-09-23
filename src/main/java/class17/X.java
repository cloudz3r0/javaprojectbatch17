package class17;



/*
Write a program where class Z inherits from class Y and class Y inherits
from Class X
 */

public class X{
    String name;
}
class Y extends X{
    String color;

}
class Z extends Y{
void printAll(){
    System.out.println(name+" "+color);
}
}