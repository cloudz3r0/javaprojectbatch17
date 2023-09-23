package class18;

public class Shape {
    /*
    create a program that takes the radius of a circle then in subclass find
    the area of said circle.
     */

float radius=3;


}
class circle extends Shape {

  void area(){
      double area=(radius*radius)*3.14;
              this.radius=radius;
      System.out.println(area);
  }
}
class Test extends circle{
    public static void main(String[] args) {
        circle c=new circle();
c.area();
    }
}