class Car{
    //instance variables
    String model;
    int year;
    String color;   
    //default contructor
    Car(){
      this.model = "Toyota";
      this.year = 2023;
      this.color = "Black";
    }
    //parametrize constructor
    Car(String model, int year, String color){
      this.model = model;
      this.year = year;
      this.color = color;
    }
    void setYear(int year){
      this.year = year;
    }
    void displayDetails(){
        System.out.println(model);
        System.out.println(year);
        System.out.println(color);
    }
 }
 class Main{
     public static void main(String[] args) {
      Car car1 = new Car();
      car1.displayDetails();

      Car car2 = new Car("Honda", 2020, "White");
      car2.displayDetails();

      Car car3 = new Car();
      car3.setYear(2000);
      car3.displayDetails();
     }
 }
 
 
 
 