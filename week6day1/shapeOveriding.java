/*Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.*/


class Shape{
  
  void getArea(){
    System.out.println(0);
  }
}

class Circle extends Shape{
  int r=5;
  void getArea(){
    System.out.println("The area of the circle is "+(3.14*r*r));
  }
}

class Rectangle extends Shape{
  int a=10,b=20;
void getArea(){
    System.out.println("The area of the Rectangle is "+(a*b));
  }  
}

class ShapeOveride{
  public static void main(String[] args){
    Circle cr=new Circle();
    Rectangle rr=new Rectangle();

    cr.getArea();
    rr.getArea();
  }
}