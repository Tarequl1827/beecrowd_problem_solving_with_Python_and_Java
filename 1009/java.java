import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String employeesName = input.nextLine();
        float employeesSalary = input.nextFloat();
        float sales = input.nextFloat();
        System.out.println("NUMBER = "+employeesName);
        System.out.printf("SALARY = R$ %.2f", (employeesSalary+sales*0.15));
    }
}