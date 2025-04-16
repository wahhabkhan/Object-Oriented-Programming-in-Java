//Hierarchy Inheritence
class Parent {
    void displayParentMethod() {
        System.out.println("Parent Method");
    }
}
class Child1 extends Parent {
    void displayChild1Method() {
        System.out.println("Child1 Method");
    }
}   
class Child2 extends Parent{
    void displayChild2Method() {
        System.out.println("Child2 Method");
    } 
}    


class main {
    public static void main(String[] args) {
      Child2 obj = new Child2();
      obj.displayChild2Method();
      obj.displayParentMethod();
      
      Child1 obj2 = new Child1();
      obj2.displayChild1Method();
      obj2.displayParentMethod();
    }
}