package salarydemo;

public class StudentEmployee extends Employee {

    private double monthlySalary;
    
        public StudentEmployee(String name, double salary )
        {
        setName(name);
        monthlySalary= salary;
        }
        
    public double weeklyPay(int hoursWorked)
    {
        double pay =monthlySalary/hoursWorked ;
        return pay;
    }
    


}