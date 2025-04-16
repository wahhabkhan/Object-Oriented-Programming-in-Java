import java.util.Scanner;
public class App {
  public static void main(String[] args ){
 
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your country:");
  String country = input.nextLine();

  if(country == "pakistan" || country == "india")
  {
    System.out.println("Enter your degree(bachelor or master):");
    String degree = input.nextLine();

    if(degree == "master"){
    System.out.println("Enter your age:");
    int age = input.nextInt();
    
    if(age >= 22 && age<=30)  {
        System.out.println("YOu are eligible");
    }
    else{
        System.out.println("you are not eligible");
    }  
    }

  }
  
}
}


  
