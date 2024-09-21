import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float R = input.nextFloat();
        System.out.printf("A=%.4f",(3.14159*(R*R)));
    }
}