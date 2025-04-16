public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    static{
        two(new String[]{});
    }
    static{
        three(new String[]{});
    }
    public static void two(String[] args) {
        System.out.println("2nd method");
    }
    public static void three(String[] args) {
        System.out.println("3rd method");
    }
}
