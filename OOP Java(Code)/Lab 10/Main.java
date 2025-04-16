class Person{
   void display(){
      System.out.println("This is Person's method");
   }
}
class Employee extends Person{
    @Override
    void display(){
      System.out.println("This is employee's method");
    }
}
public class Main {
   public static void main(String[] args) {
   Person obj = new Employee();    //Runtime polymorphism
   //Employee obj1 = new Person();   //this will cause an error
   obj.display();
   //Person p1 = new Person();
   //p1.display();
   }
}