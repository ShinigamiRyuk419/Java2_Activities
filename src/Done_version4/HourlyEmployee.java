/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version4;



/**
 *
 * @author Student.admin
 */
public class HourlyEmployee extends Employee {
    
    double ratePerHour;
    double totalHoursWorked;
    
    public HourlyEmployee(){
        //
    }
    public HourlyEmployee(double ratePerHour, double totalHoursWorked, int empID, String empName) {
        super(empID,empName);
        this.ratePerHour = ratePerHour;
        this.totalHoursWorked = totalHoursWorked;
    }
 

    
    
    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    
    @Override
    public double computeSalary() {
        if (getTotalHoursWorked()<= 40)
            return getRatePerHour() * getTotalHoursWorked();
        else
            return 40 * getRatePerHour() + (getTotalHoursWorked() - 40)* getRatePerHour() * 1.5;
    }
    
    @Override
    public String toString(){
        return "ID = " + super.getEmpID() + "\nName = " 
                + super.getEmpName() + "\nWage = " + this.ratePerHour + "\nTotal Worked Hours = " 
                + this.totalHoursWorked +"\n";
    }
        
    
}
