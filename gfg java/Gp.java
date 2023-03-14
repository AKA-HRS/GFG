import java.util.Scanner;
//Geometric Progression code
public class Gp {
    public static void main(String[] args) {
        Scanner sol = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sol.nextInt();
        System.out.print("Enter r: ");
        int r = sol.nextInt();
        System.out.print("Enter n: ");
        int n = sol.nextInt();
        int result = (a*(int)(Math.pow(r,(n-1))));//by deafult Math.pow(double, double) takes both as double
        System.out.println("The Nth term will be: %d "+result);
        sol.close();
    }
}
