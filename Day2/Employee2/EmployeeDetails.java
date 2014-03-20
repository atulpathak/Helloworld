import java.util.Scanner;
public class EmployeeDetails{
public static void main(String[] args){

String c; 
Scanner sc=new Scanner(System.in);
 System.out.println("enter the city");
 c=sc.nextLine();

Employee emp=new Employee("calcutta");
emp.displayEmployeeDetails();
}
}
