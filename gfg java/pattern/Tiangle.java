package pattern;
//right-angle triangle// 
public class Tiangle {
    public static void main(String[] args) {
        int row=1;
        while (row<5) {
            int coloumn=1;
            while (coloumn<=row) {
                System.out.print("* ");
                coloumn++;
            }
            System.out.print("\n");
            row++;
        }
    }
}
