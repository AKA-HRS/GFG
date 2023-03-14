import java.util.*;
public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int test = sc.nextInt();
        int result = ((test*(test+1))/2);
        System.out.println(result);

        sc.close();
    }
}
