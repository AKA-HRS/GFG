import java.util.Scanner;
public class FindLastDigitOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int as = input.nextInt();
        int result = as%10;
        System.out.println(result);
        input.close();
    }
}
