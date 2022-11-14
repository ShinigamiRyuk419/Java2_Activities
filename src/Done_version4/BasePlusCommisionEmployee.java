/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version4;



/**
 *
 * @author Student.admin
 */
public class BasePlusCommisionEmployee  extends CommisionEmployee{ //I extended the CommisionEmployee to my BasePlusCommisionEmployee
    double baseSalary;
    
    public BasePlusCommisionEmployee(){
        
    }

    public BasePlusCommisionEmployee(double baseSalary, double totalSales, double commisionRate, int empID, String empName) {
        super(totalSales, commisionRate, empID, empName);
        this.baseSalary = baseSalary;
    }
    
    public BasePlusCommisionEmployee(double baseSalary, double totalSales, double commisionRate) {
        super(totalSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return getBaseSalary() + super.computeSalary();
    }
    
    @Override
    public String toString(){
        return  "ID = " +super.getEmpID()  + "\nName = " 
                + super.getEmpName() + "\nBase Salary = " + getBaseSalary() +  "\nTotal Wages =  " + this.computeSalary() + "\n\n";
    }
}

