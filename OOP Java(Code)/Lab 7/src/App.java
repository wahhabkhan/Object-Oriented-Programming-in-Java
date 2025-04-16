class Box {
  int value;
  Box(int value){
   this.value = value;
  }
}

public class App {
  public static void modify(Box b1){
    b1.value = 24;
  }
  public static void changereference(Box b1){
    b1 = new Box(100);
  }
  public static void main(String[] args) {
    Box b1 = new Box(14);
    System.out.println("Before modification:" + b1.value);  //14
    modify(b1);
    System.out.println("After modification:" + b1.value);   //24
    changereference(b1);
    System.out.println("Re-assign:" + b1.value);   //
  }
}



