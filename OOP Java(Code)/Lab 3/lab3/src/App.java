import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("For Loop");
        for(int i=1; i<=5; i++){  
              System.out.println(i);
        }
        
        System.out.println("While Loop");
        int i=1;
        while (i<=5) {
          System.out.println(i); 
          i++; 
        }


        int j=1;
        System.out.println(j++);
        System.out.println(j);

         int j=1;
         System.out.println(++j);
        
        System.out.println("Do While Loop");
        int i=1;
        do{
          System.out.println(i);
          i++;  
        }
        while(i<=5);

        for(int k=1; k<=10; k++ ){
            int j=2;
            System.out.println(2 + "x" + k + "=" + k*j);
        }
   
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int k=1; k<=10; k++ ){

            System.out.println(num + "x" + k + "=" + k*num);
        }
    }
}
