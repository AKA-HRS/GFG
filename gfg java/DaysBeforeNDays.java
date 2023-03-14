import java.util.Scanner;
public class DaysBeforeNDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days: ");
        int d = sc.nextInt();
        System.out.println("Enter the day before: ");
        int n = sc.nextInt();
        int result = (n)%7;
        result = d-result;
        if(result<0)
        System.out.println(result+7);
        else
        System.out.println(result);
        sc.close();
    }
}
