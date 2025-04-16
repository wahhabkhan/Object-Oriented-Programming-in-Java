//Hierarchy Inheritence  
class Parent{
    void displayParentMethod(){
        System.out.println(" Parent method");
    }
}
class Child1 extends Parent{
    void displayChild1Method(){
        System.out.println("Child1 method");
    }
}
class Child2 extends Parent{
    void displayChild2Method(){
        System.out.println("Child2 method");
    }
}
class Main{
    public static void main(String[] args) {
     Child2 obj = new Child2();
     obj.displayChild2Method(); 
     obj.displayParentMethod();

     Child1 obj1 = new Child1();
     obj1.displayChild1Method();
     obj1.displayParentMethod();
     

    
    }
}