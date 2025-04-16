abstract class Shape{
    String color;

    Shape(String color){
     this.color = color;
    }
    abstract double area();
    void display(){
        System.out.println("Color:" + color);
    }

}
class Circle extends Shape{
double radius;
Circle(String color, double radius){
   super(color);
   this.radius = radius;
}
double area(){
    return Math.PI * radius * radius;
}
}

class Rectangle extends Shape{
 double length, width;
 Rectangle(String color,double length,double width){
  super(color);
    this.length = length;
  this.width = width;
 }
 double area(){
    return length * width;
}   
}


class main{
    public static void main(String[] args) {
     Shape circle = new Circle("Red",2.3);
     circle.area();
     circle.display();
     Shape rectangle = new Rectangle("Green", 6, 4);  
     rectangle.area();
     rectangle.display(); 
    }
}