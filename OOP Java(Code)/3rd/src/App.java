public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("3rd Prog");
        
        // Create an instance of the App class to call the instance method child
        App appInstance = new App();
        appInstance.child(args);

        App calculations = new App();
        calculations.run(args);
    }
    
    public void child(String[] args) {
        System.out.println("Out");
    }

    public void run(String[] args){
        int a = 2;
        int b = 7;
        int sum;
        sum = a + b;
        System.out.println(sum);
    }
}
