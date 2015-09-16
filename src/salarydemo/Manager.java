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
public class Manager extends SalariedEmployee
{
   private double weeklyBonus;

   /**
      Constructs a manager with a given name, annual salary and weekly bonus.
      @param name the name of this employee
      @param salary the annual salary
      @param bonus the weekly bonus
    */
   public Manager(String name, double salary, double bonus)
   {
      super(name, salary);
      weeklyBonus = bonus;
   }

   public double weeklyPay(int hoursWorked)
   {
      return super.weeklyPay(hoursWorked) + weeklyBonus;
   }
}

