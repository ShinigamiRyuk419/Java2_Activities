/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version2;

/**
 *
 * @author Student.admin
 */
public class Employee {
    int empID;
    String empName;

    public Employee() {
    }//this is the default like constructor

    
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
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
    
    public void displayInfo(){
        System.out.println(this);
    }
    
    public double computeSalary(){
        System.out.println(this.computeSalary());
        return 0;
    }
    
    @Override
    public String toString(){
        return "ID = " + this.empID + "\nName = " 
                + this.empName;
    }  

}
