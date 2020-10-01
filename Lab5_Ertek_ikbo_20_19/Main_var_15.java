package Lab5_Ertek_ikbo_20_19;
import java.util.Scanner;
public class Main_var_15 {
    public static void recursion(int N){
        if (N>9){
            System.out.println(N%10);
            recursion(N/10);
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
