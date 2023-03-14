import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt(); 
        if(input>0)
        {
          int result = input%2;
          if(result==0)
           System.out.println("Number is Positive Even");
           else
           System.out.println("Number is Positive Odd");
        }
        else if(input<0)
        {
            int result = input%(-2);
            if(result==0)
           System.out.println("Number is Negative Even");
           else
           System.out.println("Number is Negative Odd");
        }
        else
        System.out.println("Number is Zero");
        sc.close();
    }
}
