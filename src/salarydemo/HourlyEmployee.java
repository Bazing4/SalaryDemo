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
public class HourlyEmployee extends Employee
{
   protected double hourlyWage;

   /**
      Constructs an hourly employee with a given name and weekly wage.
      @param name the name of this employee
      @param wage the hourly wage 
   */
   public HourlyEmployee(String name, double wage)
   {
      setName(name);
      hourlyWage = wage;
   }
 
   public double weeklyPay(int hoursWorked)
   {
      double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         // Add overtime
         pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
      }
      return pay;
   }
}
