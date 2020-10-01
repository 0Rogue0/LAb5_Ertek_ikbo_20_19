package ForLab4_Ertek_ikbo_20_19;
import java.util.Scanner;
public class Main_var_14 {
    public static void recursion(int N){
        if (N>9){
            recursion(N/10);
            System.out.println(N%10);
        } else {
            System.out.println(N);
        }
    }
    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        recursion(N);
    }
}
