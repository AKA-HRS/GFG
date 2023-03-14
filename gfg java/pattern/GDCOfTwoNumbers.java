package pattern;

public class GDCOfTwoNumbers {
    public static void main(String[] args) {
        int num1=10,num2=15,result=1;
        int i=1;
        while(i<=Math.min(num1,num2)){

              if(num1%i==0 && num2%i==0)
               result=i;
            i++;
        }
        System.out.println(result);
    }
}
