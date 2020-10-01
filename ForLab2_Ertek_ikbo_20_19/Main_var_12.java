package ForLab2_Ertek_ikbo_20_19;
import java.util.Scanner;
public class Main_var_12 {
    public static void recursion(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x>0){
            if(x%2==1){
                System.out.println(x);
                recursion();
            }else{
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
