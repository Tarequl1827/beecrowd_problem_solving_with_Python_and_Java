import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        System.out.println("DIFERENCA = "+(A*B-C*D));
    }
}