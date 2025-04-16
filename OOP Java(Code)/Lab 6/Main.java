// class Box{
//    int value;   
//    Box(int value){
//      this.value = value;
//    } 
// }
// public class Main {
//    public static void modify(Box box) {
//      box.value = 100;
//    }
//   public static void main(String[] args) {
//     Box mybox =  new Box(10);
//     System.out.println("Before modification:" + mybox.value);
//     modify(mybox);
//     System.out.println("After modification" + mybox.value);
//   }
//  }


// public class Main {
//     public static void modify(int x) {
//        x = 100; 
//     }
//     public static void main(String[] args) {
//         int x = 10;
//         modify(x);
//         System.out.println(x);
//     }
// }

// class Box{
//    int value;   
//    Box(int value){
//      this.value = value;
//    } 
// }
// public class Main {
//    public static void modify(Box box) {
//      box.value = 100;
//    }
//    public static void changeReference(Box box) {
//      box = new Box(200);
//    }
//   public static void main(String[] args) {
//     Box mybox =  new Box(10);
//     modify(mybox);
//     System.out.println(mybox.value);   //100
//     changeReference(mybox);
//     System.out.println(mybox.value);   //100
//   }
// }

// class Main{
//     public static void main(String[] args) {
//        int x = 10;
//        x = 100;
//        int y = 100;
//        String a = "Ali";
//        String b = "Ali"; 
//        System.out.println(x);   //100
//        System.out.println( x==y);
//        System.out.println(a == b);
//     }
// }
class Person{
    int age;
    String name;

    Person(String name, int age){
        this.name =  name;
        this.age = age;
    }
    
}
public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Ali", 20);
    Person person2 = new Person("Ali", 20);
    System.out.println(person1 == person2);  //true -> false
    System.out.println(person1.equals(person2));  //true  -> false
    Person person3 = person1;
    System.out.println(person1.equals(person3));   //true
    System.out.println(person1==person3); 
  }    
}
