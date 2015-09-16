/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarydemo;

/**
 *
 * @author Marco
 */
public class Employee
{
   private String name;

   /**
      Constructs an employee with an empty name.
   */
   public Employee()
   {
      name = "";
   }

   /**
      Sets the name of this employee.
      @param employee_name the new name 
   */
   public void setName(String employeeName)
   {
      name = employeeName;
   }

   /**
      Gets the name of this employee.
      @return the name 
   */
   public String getName()
   {
      return name; 
   }

   /**
      Computes the pay for one week of work.
      @param hoursWorked the number of hours worked in the week
      @return the pay for the given number of hours
   */
    public boolean payment() 
    {
        return true;
    }
       
   public double weeklyPay(int hoursWorked)
   {
      return 0; 
   }
}
