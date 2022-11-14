/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version3;

import java.util.Arrays;
import java.util.Formatter;

/**
 *
 * @author Student.admin
 */
public class EmployeeRoster1 {

    int i;
    Formatter form = new Formatter();
   
    Employee[] employees = {
        new HourlyEmployee(10_000, 45, 1234, "Jo-ann"),//double ratePerHour, double totalHoursWorked, int empID, String empName
        new HourlyEmployee(10_000, 50, 4567, "Joemar"),//4567, "Joemar Bernadez", 10_000, 50
        new HourlyEmployee(10_000, 56, 1345, "Jovet"),//1345, "Jovet Maceda", 10_000, 56 
        new CommisionEmployee(30_000, 0.05, 1023, "Joshua"),//double totalSales, double commisionRate, int empID, String empName
        new CommisionEmployee(55_000, 0.10, 1024, "John"),
        new BasePlusCommisionEmployee(5_000, 30_000, 0.05, 1023, "Joshua"),//double baseSalary, double totalSales, double commisionRate, int empID, String empName
        new BasePlusCommisionEmployee(5_000, 55_000, 0.10, 1024, "John"),
        new PeiceWorkerEmployee(310, 25, 1025, "Katugon"),
        new PeiceWorkerEmployee(1, 45, 1026, "Sheessh")};//double totalPiecesFinished, double ratePerPiece, int empID, String empName

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void displayEmployee() {
        
        form.format("%5s %16s %25s %15s\n", "EmpID", "EmpName", "EmpType" , "TotalSalary\n");
        for (i = 0; i < employees.length; i++) {
            form.format("%5s %15s %25s %15s\n", employees[i].empID, employees[i].empName,employees[i].getClass().getSimpleName(), employees[i].computeSalary());
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(form);
        System.out.println("--------------------------------------------------------------------------");
    }

    public void countHourlyEmployee() {
        int count = 0;
        EmployeeRoster1 obj = new EmployeeRoster1();
        Employee[] ee = obj.getEmployees();
        for (Employee empl : employees) {
            if (empl instanceof HourlyEmployee) {
                for (int i = 0; i < ee.length; i++) {
                    count++;
                }
            }
        }
        int hnum = (count / ee.length);
        System.out.println("Number of HourlyEmployee : " + hnum);
    }

    public void countCommisionEmployee() {
        int count = 0;
        EmployeeRoster1 obj = new EmployeeRoster1();
        Employee[] ee = obj.getEmployees();
        for (Employee empl : employees) {
            if (empl instanceof CommisionEmployee) {
                for (int i = 0; i < ee.length; i++) {
                    count++;
                }
            }
        }
        int Cnum = (count / ee.length);
        System.out.println("Number of CommissionEmployee : " + Cnum);
    }

    public void countBasePlusCommisionEmployee() {
        int count = 0;
        EmployeeRoster1 obj = new EmployeeRoster1();
        Employee[] ee = obj.getEmployees();
        for (Employee empl : employees) {
            if (empl instanceof BasePlusCommisionEmployee) {
                for (int i = 0; i < ee.length; i++) {
                    count++;
                }
            }
        }
        int Bnum = count / ee.length;
        System.out.println("Number of BasePlusCommissionEmployee : " + Bnum);
    }

    public void countPieceWorkerEmployee() {
        int count = 0;
        EmployeeRoster1 obj = new EmployeeRoster1();
        Employee[] ee = obj.getEmployees();
        for (Employee empl : employees) {
            if (empl instanceof PeiceWorkerEmployee) {
                for (int i = 0; i < ee.length; i++) {
                    count++;
                }
            }
        }
        System.out.println("Number of BasePlusCommissionEmployee : " + count / ee.length);
    }

    public void displayHourlyEmployee() {
        System.out.print("Hourly Employee:\n");
        for (Employee empl : employees) {
            if (empl instanceof HourlyEmployee) {
                System.out.println(((HourlyEmployee) empl)); // Can encapsulate

            }
        }
    }

    public void displayCommisionEmployee() {
        System.out.print("Commission Employee:\n");
        for (Employee empl : employees) {
            if (empl instanceof CommisionEmployee) {
                System.out.println(((CommisionEmployee) empl)); // Can encapsulate

            }
        }
    }

    public void displayBasePlusCommisionEmployee() {
        System.out.print("BasePlusCommission Employee:\n");
        for (Employee empl : employees) {
            if (empl instanceof BasePlusCommisionEmployee) {
                System.out.println(((BasePlusCommisionEmployee) empl)); // Can encapsulate

            }
        }
    }

    public void displayPieceWorkerEmployee() {
        System.out.print("Piece Worker Employee:\n");
        for (Employee empl : employees) {
            if (empl instanceof PeiceWorkerEmployee) {
                System.out.println(((PeiceWorkerEmployee) empl)); // Can encapsulate

            }
        }
    }
    
//    public Employee[] addEmployee() {
//        Employee[] newEmp = new Employee[employees.length+1];
//        for ( i = 0; i < employees.length; i++) {
//            newEmp[i] = employees[i];
//        newEmp[employees.length] = new HourlyEmployee(1,1,1,"SA");
//        }
//        return newEmp;
//    }
//    
     Employee[] newEmp = new Employee[employees.length+1];
    public void showAddEmployee(){
        form.format("%5s %16s %25s %15s\n", "EmpID", "EmpName", "EmpType" , "TotalSalary\n");
        for (i = 0; i < employees.length; i++) {
            newEmp[i] = employees[i];
            newEmp[employees.length] = new HourlyEmployee(1,1,1,"SA");
            
        }
        form.format("%5s %15s %25s %15s\n", newEmp[i].empID,newEmp[i].empName,newEmp[i].getClass().getSimpleName(),newEmp[i].computeSalary());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(form);
        System.out.println("--------------------------------------------------------------------------");
    }

    public void removeEmployee(int empID) {//diri nako
//        Employee eee = new Employee();
//        EmployeeRoster1 e1 = new EmployeeRoster1();
        Employee[] employ = new Employee[employees.length - 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].empID == (empID)) {
                System.arraycopy(employees, 0, employ, 0, i);
                System.arraycopy(employees, i + 1, employ, i, employees.length - i - 1);
            }
        }
        System.out.println("Array after deleting an employee: \n"
                + Arrays.toString(employ));
    }

}
