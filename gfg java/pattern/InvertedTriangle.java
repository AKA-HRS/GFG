package pattern;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while (row<=n) {
            int coloumn=1;
            while (coloumn<=(n-row)) {
                System.out.print(" ");//wrong hai sahi krna hoga//
                coloumn++;
            }
            while (coloumn<=n) {
                System.out.print("*"); 
                coloumn++;               
            }
            row++;
            System.out.print("\n");
        }
    }
}
