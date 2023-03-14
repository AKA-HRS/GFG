/*question is there is N cups which is picked by you and your opponent
 * but the CONDITION is :
 * FIRST cup will be picked by you
 * Person picking last cup will be the winner
 */


import java.util.Scanner;
public class Even_odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cups: ");
        int numberOfCups = sc.nextInt();
        if(numberOfCups%2==0)
        System.out.println("The last cup will be picked by Opponent, Therefore /Opponent/ is the winner");   
        else     
        System.out.println("The last cup will be picked by you, Therefore /You/ are the winner");
        sc.close();
    }
}
