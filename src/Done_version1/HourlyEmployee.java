/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version1;

/**
 *
 * @author Student.Admin
 */
public class HourlyEmployee {
    int empID;
    String empName;
    double ratePerHour;
    double totalHoursWorked;
    
//    This is a default constructor
    public HourlyEmployee(){
        empID = 0; 
        empName = "No Name";
        ratePerHour = 0.0;
        totalHoursWorked = 5.0;
        
    }
//    this is a constructor with parameters
    public HourlyEmployee(int empID, String empName, double ratePerHour, double totalHoursWorked){
        this.empID = empID;
        this.empName = empName;
        this.ratePerHour = ratePerHour;
        this.totalHoursWorked = totalHoursWorked;
    }

    
//    This is a getter 
    public int getEmpID() {
        return empID;
    }
//    this is a setter
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
    
//displayInfo method
    public void displayInfo(){
        System.out.println(this);
//       HourlyEmployee h1, h2, h3 , h4, h5;
//        
//        h1 = new HourlyEmployee(); //I am using the default constructor
//        h2 = new HourlyEmployee(1234, "Joan Maceda", 5000.0, 45.0); //I am using the constructor with parameters
//        h3 = new HourlyEmployee (5678, "John Doe", 5000.0, 40.0);
//        h4 = new HourlyEmployee ();
//        h5 = new HourlyEmployee(9123, " John Del", 5000.0, 55.0);
//        
//        h1.setEmpName("Bernadez");
//        h4.setEmpName("Ortiz");
// 
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
//        System.out.println(h4);
//        System.out.println(h5);
        
        
    }
    
//    public double calculateSalary() {
//        double salary = 0;
//        double overtime = 0;
//
//        if (totalHoursWorked % 40 == 0) {
//            salary = totalHoursWorked * ratePerHour;
//            return salary;
//        } else {
//            double hour = totalHoursWorked % 40;
//            overtime = hour * (ratePerHour * 1.5);
//            salary = totalHoursWorked * ratePerHour;
//            double pay = salary + overtime;
//            return pay;
//        }
//    }
//    computeSalary method
    public double computeSalary(){
       if (getTotalHoursWorked()<= 40)
            return getRatePerHour() * getTotalHoursWorked();
        else
            return 40 * getRatePerHour() + (getTotalHoursWorked() - 40)* getRatePerHour() * 1.5;
       
    }
       
 
    //this is an overriden method
    @Override
    public String toString(){
        return "ID = " + this.empID + "\nName = " 
                + this.empName + "\nRate Per Hour = " + this.ratePerHour + "\nTotal Worked Hours = " 
                + this.totalHoursWorked + "\nTotal Wage = Php "  + this.computeSalary() + "\n\n";
    }  
}
