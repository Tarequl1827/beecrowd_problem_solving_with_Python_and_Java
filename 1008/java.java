import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int employeesNumber = input.nextInt();
        int employeesWorkingHour = input.nextInt();
        float amountPerHour = input.nextFloat();
        System.out.println("NUMBER = "+employeesNumber);
        System.out.printf("SALARY = U$ %.2f", (employeesWorkingHour*amountPerHour));
    }
}