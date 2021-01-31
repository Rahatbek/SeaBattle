import java.util.Scanner;

public class Coordinat {


    private int col;
    private int row;

    public void input() {
        System.out.println("Col: ");
        Scanner scan = new Scanner(System.in);
        this.col = scan.nextInt();
        System.out.println("Row: ");
        this.row = scan.nextInt();
    }
}
