import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("-> Ingrese el numero A");
        int A = scan.nextInt();

        System.out.println("-> Ingrese el numero B");
        int B = scan.nextInt();
        
        System.out.println("-> A + B = " + A + " + " + B + " = " + (A + B));
        System.out.println("-> A x B = " + A + " x " + B + " = " + (A * B));
        System.out.println("-> A - B = " + A + " - " + B + " = " + (A - B));
        System.out.println("-> A / B = " + A + " / " + B + " = " + (B != 0 ? A / B : "undefined"));

        scan.close();
    }
    
}
