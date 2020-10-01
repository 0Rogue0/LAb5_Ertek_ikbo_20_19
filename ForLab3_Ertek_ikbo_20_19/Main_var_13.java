package ForLab3_Ertek_ikbo_20_19;
import java.util.Scanner;
public class Main_var_13 {
    public static void recursion(){
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        if (j != 0){
            System.out.println(j);
            int u = in.nextInt();
            if (u != 0){
                recursion();
            }
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
