/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version4;



/**
 *
 * @author Student.admin
 */
public class CommisionEmployee extends Employee {
    double totalSales;
    double commisionRate;//I added this
    
    public CommisionEmployee(){
        //
    }
    public CommisionEmployee(double totalSales, double commisionRate) {
        this.totalSales = totalSales;
        this.commisionRate = commisionRate;
    }
     public CommisionEmployee(double totalSales, double commisionRate, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
        this.commisionRate = commisionRate;
    }
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }
    @Override
    public double computeSalary(){//since I add the Commision rate I will just be basing the rate from the given:
    //    0 - 10,000 = 5%
    //    >10,000 but <50,000  = 10%
    //    >50,000 bt <100,000  = 15%
    //    >100,000   = 30%
        return getCommisionRate() * getTotalSales();
    }
    
    @Override
    public String toString(){
        return "ID = " + super.getEmpID() + "\nName = " 
                + super.getEmpName() + "\nSales = " + this.totalSales +  "\nCommision Rate =  " + getCommisionRate() + "\n\n";
    }

}
