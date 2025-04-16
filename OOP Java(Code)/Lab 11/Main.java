interface Animal {
   public void sound1();
   public void sound2();
}
class Dog implements Animal{
    public void sound1(){
      System.out.println("The Dog barks");
     }
}
class Cat implements Animal{
  public void sound2(){
    System.out.println("The cat meows");
   }
}
public class Main{
  public static void main(String[] aStrings){
    Dog obj1 = new Dog();
    obj1.sound1();
    Cat obj2 = new Cat();
    obj2.sound2();
  }
}