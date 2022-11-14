/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version1;

/**
 *
 * @author Student.Admin
 */
public class CommisionEmployee {
    int empID;
    String empName;
    double totalSales;
    double commisionRate;

    
    
    //    This is a default constructor
    public CommisionEmployee(){
        empID = 0; 
        empName = "No Name";
        totalSales = 0.0;
        
    }
    //    this is a constructor with parameters
    public CommisionEmployee(int empID, String empName, double totalSales, double commisionRate){
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
        this.commisionRate = commisionRate;
    }
    
    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
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
    
    public void displayInfo(){
        System.out.println(this);
//       CommisionEmployee c1, c2, c3 , c4, c5;
//        
//        c1 = new CommisionEmployee(); //I am using the default constructor
//        c2 = new CommisionEmployee(1234, "Joan Maceda", 10000); //I am using the constructor with parameters
//        c3 = new CommisionEmployee (5678, "John Doe", 10000);
//        c4 = new CommisionEmployee ();
//        c5 = new CommisionEmployee(9123, " John Del", 10000);
//        
//        c1.setEmpName("Bernadez");
//        c4.setEmpName("Ortiz");
// 
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//        System.out.println(c5);
//  
    }
    
    public double computeSalary(){
      return getCommisionRate() * getTotalSales();
       
    }
    
    
    @Override
    public String toString(){
        return "ID = " + this.empID + "\nName = " 
                + this.empName + "\nSales = " + this.totalSales +  "\nTotal Commission = Php " + this.computeSalary() + "\n\n";
    }
    
}
