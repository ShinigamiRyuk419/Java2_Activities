/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version1;

/**
 *
 * @author Student.Admin
 */
public class BasePlusCommisionEmployee {
    int empID;
    String empName;
    double totalSales;
    double baseSalary;
    double commisionRate;
    
    //    This is a default constructor
    public BasePlusCommisionEmployee(){
        empID = 0; 
        empName = "No Name";
        totalSales = 0.0;
        baseSalary = 0.0;
        
    }
    //    this is a constructor with parameters
    public BasePlusCommisionEmployee(int empID, String empName, double totalSales, double baseSalary, double commisionRate){
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.commisionRate = commisionRate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void displayInfo(){
        System.out.println(this);
  
    }
    
    public double computeSalary(){ 
       return getBaseSalary() + commisionRate * totalSales;
       
    }
     @Override
    public String toString(){
        return "ID = " + this.empID + "\nName = " 
                + this.empName + "\nSales = " + this.totalSales + "\nCommission Rate = " + this.commisionRate +  "\nTotal Wages = Php " + this.computeSalary() + "\n";
    }
    
}
