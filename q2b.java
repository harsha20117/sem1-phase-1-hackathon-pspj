import java.util.Scanner;
public class q2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the energy generated:");
        int ene = sc.nextInt();

        if (ene > 10){
            System.out.println("Good Energy Generation");
        }else{
            System.out.println("Low Energy Generation");
        }
    }
    
}
