import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner sol = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sol.nextInt();
        System.out.print("Enter d: ");
        int d = sol.nextInt();
        System.out.print("Enter n: ");
        int n = sol.nextInt();
        int result = (a+(n-1)*d);//multiplication first
        System.out.println("The Nth term will be: %d "+result);
        sol.close();
    }
}
