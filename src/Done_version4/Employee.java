/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version4;



/**
 *
 * @author Student.admin
 */
public abstract class Employee {
    public String empName;
    public int empID;
    
    
    public Employee(){
        //
    }            
    public Employee( int empID, String empName) {
        this.empName = empName;
        this.empID = empID;
    }
    
    

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    @Override
    public String toString(){
        return "ID = " + this.empID + "\nName = " 
                + this.empName; 
//        return String.format( "%s %s\nEmployee Name: %s", getEmpID(), getEmpName() );
    }
    
    public abstract double computeSalary();//abstract constructor

}
