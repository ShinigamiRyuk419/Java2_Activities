/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version2;

/**
 *
 * @author Student.admin
 */
public class HourlyEmployee extends Employee {
    double ratePerHour;
    double totalHoursWorked;

    public HourlyEmployee() {
    }

   
    public HourlyEmployee(double ratePerHour, double totalHoursWorked) {
        this.ratePerHour = ratePerHour;
        this.totalHoursWorked = totalHoursWorked;
    }

    public HourlyEmployee(double ratePerHour, double totalHoursWorked, int empID, String empName) {
        super(empID, empName);
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
    public void displayInfo(){
        System.out.println("These are Hourly Employee:");
        HourlyEmployee[] he = new HourlyEmployee [5];
             
        he[0] = new HourlyEmployee( 10_000, 45, 1234, "Joann Maceda");
        he[1] = new HourlyEmployee (10_000, 45, 1234, "Joann Maceda" );
        he[2] = new HourlyEmployee ( 10_000, 45, 1234, "Joann Maceda");
        he[3] = new HourlyEmployee ( 10_000, 45, 1234, "Joann Maceda");
        he[4] = new HourlyEmployee (10_000, 45, 1234, "Joann Maceda" );
        
        
        for (HourlyEmployee hem : he){
            System.out.println(hem);
        }
    }
    
    public double computeSalary(){
       if (getTotalHoursWorked()<= 40)
            return getRatePerHour() * getTotalHoursWorked();
        else
            return 40 * getRatePerHour() + (getTotalHoursWorked() - 40)* getRatePerHour() * 1.5;
    }
    
    //this is an overriden method
    @Override
    public String toString(){
        return "-----For Hourly Employees:\n"+ "ID = " + super.empID + "\nName = " 
                + super.empName + "\nWage = " + this.ratePerHour + "\nTotal Worked Hours = " 
                + this.totalHoursWorked + "\nTotal Wage = Php "  + this.computeSalary() + "\n";
    }  
}
