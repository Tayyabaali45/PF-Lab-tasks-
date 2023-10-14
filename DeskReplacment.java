import java.util.*;

public class DeskReplacment 

{

public static void main (String []args)

{

Scanner input = new Scanner(System.in);

System.out.println(""Please enter the number of students in classroom 1:");

int classOneStudents = input.nextInt();

System.out.println(""Please enter the number of students in classroom 2:");

int classTwoStudents = input.nextInt();

System.out.println(""Please enter the number of students in classroom 3:");
int classThreeStudents = input.nextInt();

int desksRequired for Class1 = classOneStudents/2

int desksRequired for Class2 = classTwoStudents/2

int desksRequired for Class3 = classThreeStudents/2

int TotalRequirement= desksRequired for Class1 + desksRequired for Class2 + desksRequired for Class3 

System.out.println("The total desks required for three classes are:" +TotalRequired) 
}

}