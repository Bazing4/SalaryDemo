
package salarydemo;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class SalaryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          Employee[] staff = new Employee[4];
          staff[0] = new HourlyEmployee("Morgan, Harry", 30);
          staff[1] = new SalariedEmployee("Lin, Sally", 52000); 
          staff[2] = new Manager("Smith, Mary", 104000, 50);
          staff[3] = new StudentEmployee("Rodrigues, Marco",5000);
                
      
          Scanner in = new Scanner(System.in);
          for (Employee e : staff)
          {
          System.out.print("Hours worked by " + e.getName() + ": ");
          int hours = in.nextInt();
          System.out.println("Salary: " + e.weeklyPay(hours));

   
          }
    }
    
}
