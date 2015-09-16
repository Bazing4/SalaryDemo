package salarydemo;

public class StudentEmployee extends HourlyEmployee {

	private double maxHours;
	private boolean inExamSchedule;

	
       /**
	 * 
	 * @param name
	 * @param wage
	 * @param maxWorkHours
	 * @param inExams
	 */
	
        public StudentEmployee(String name, double wage, double maxWorkHours, boolean inExams) {
            
            super(name, wage);
            maxHours = maxWorkHours;
            inExamSchedule = inExams;
	}
        
        
        /**
	 * 
	 * @param hoursWorked
	 */
        @Override
	public double weeklyPay(int hoursWorked) {
	            
            examNotification();
             if (hoursWorked > maxHours){
                System.out.println("This student shouldn't have worked " + (hoursWorked - maxHours) 
                        + "Over their limit. Please notify manager of Work-Study scheduling error.");                
               return  hourlyWage * maxHours;  
            }
             else{
                 return hoursWorked * hourlyWage;
             }
            
	}
        
        public void examNotification(){
            if (inExamSchedule){
                System.out.println("Please note: This student is in their exam schedule."
                        + "Take this into consideration when scheduling their hours for the"
                        + "upcoming pay period.");
            }
        }



}