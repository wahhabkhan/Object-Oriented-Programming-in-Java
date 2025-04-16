class Car{
    //instance variables
    String model;
    int year;
    String color; 

    Car(String model, int year, String color){
       this.model = model;
       this.year = year;
       this.color = color; 
    }
    
    void displayCarDetails(){
     System.out.println("Car Model:" + model );   
     System.out.println("Car Year:" + year );
     System.out.println("Car Color:" + color );    
    }
}
class Main{
  public static void main(String[] args){
    Car car1 = new Car("Toyota Camry", 2022, "Black");   //object   

    car1.displayCarDetails();
  }  
}











