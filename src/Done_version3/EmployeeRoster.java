/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Student.admin
 */
public class EmployeeRoster {

    int i;

    private Employee[] emp = {
        new HourlyEmployee(40, 100, 101, "Me"),
        new HourlyEmployee(40, 120, 102, "you") //      
    };
    private Employee[] emp1 = {
        new CommisionEmployee(40, 100, 101, "Me"),
        new CommisionEmployee(40, 120, 102, "you")
    };
    private Employee[] emp2 = {
        new BasePlusCommisionEmployee(40, 100, 12, 101, "Me"),
        new BasePlusCommisionEmployee(40, 120, 14, 102, "you")
    };
    private Employee[] emp3 = {
        new PeiceWorkerEmployee(40, 100, 101, "Me"),
        new PeiceWorkerEmployee(40, 120, 102, "you"),
        new PeiceWorkerEmployee(40, 120, 122, "Us")
    };

    public Employee[] getEmp3() {
        return emp3;
    }

    public void setEmp3(Employee[] emp3) {
        this.emp3 = emp3;
    }

    public Employee[] getEmp2() {
        return emp2;
    }

    public void setEmp2(Employee[] emp2) {
        this.emp2 = emp2;
    }

    public Employee[] getEmp1() {
        return emp1;
    }

    public void setEmp1(Employee[] emp1) {
        this.emp1 = emp1;
    }

    public Employee[] getEmp() {
        return emp;
    }

    public void setEmp(Employee[] emp) {
        this.emp = emp;
    }



//    public void addEmployee1(){
//        this.displayHourlyEmployee();
//        System.out.println(new HourlyEmployee(1,1,1,"Okay") + "\n" );
//        this.displayCommisionEmployee();
//        System.out.println(new CommisionEmployee() + "\n");
//    }
    //Counter
    public void countHourlyEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp();
        System.out.println("Number of Hourly Employee : " + Array.getLength(ee));
    }

    public void countCommisionEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp1();
        System.out.println("Number of Commission Employee : " + Array.getLength(ee));
    }

    public void countBasePlusCommisionEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp2();
        System.out.println("Number of BasePlusCommission Employee : " + Array.getLength(ee));
    }

    public void countPieceWorkerEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp3();
        System.out.println("Number of Piece Worker Employee : " + Array.getLength(ee));
    }

    //to display all employees
    public void displayEmployee() {
        this.displayHourlyEmployee();
        this.displayCommisionEmployee();
        this.displayBasePlusCommisionEmployee();
        this.displayPieceWorkerEmployee();
    }

    public void displayHourlyEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp();
        System.out.println("Hourly Employee");
        for (i = 0; i < ee.length; i++) {
            System.out.println(ee[i]);
        }
        System.out.println("------------------------");
    }

    public void displayCommisionEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp1();
        System.out.println("Commission Employee");
        for (i = 0; i < ee.length; i++) {
            System.out.println(ee[i]);
        }
        System.out.println("------------------------");
    }

    public void displayBasePlusCommisionEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp2();
        System.out.println("Base Plus Commission Employee");
        for (i = 0; i < ee.length; i++) {
            System.out.println(ee[i]);
        }
        System.out.println("------------------------");
    }

    public void displayPieceWorkerEmployee() {
        EmployeeRoster obj = new EmployeeRoster();
        Employee[] ee = obj.getEmp3();
        System.out.println("Piece Worker Employee");
        for (i = 0; i < ee.length; i++) {
            System.out.println(ee[i]);
        }
        System.out.println("------------------------");
    }

    public void addEmployee() {
        Employee[] allh = this.getEmp();
        Employee[] allc = this.getEmp1();
//        Employee[] dungag = { new HourlyEmployee()};
        System.out.println("Hourly Employee");
        for (i = 0; i < allh.length; i++) {
            System.out.println(allh[i]);
        }
        System.out.println(new HourlyEmployee() + "\n");
        System.out.println("Commision Employee");
        for (i = 0; i < allc.length; i++) {
            System.out.println(allc[i]);
        }
        System.out.println(new CommisionEmployee());
        System.out.println("------------------------");
//        Employee[] employees = this.getEmp();
//        Employee[] dungag = { new HourlyEmployee()};
//        System.out.println(Arrays.toString(dungag) + Arrays.toString(employees));
    }

    public void removeEmployee() {
        Employee emp = new Employee();
        int id = emp.getEmpID();
        Employee[] rem = this.getEmp();
        Employee[] bago = new Employee[rem.length - id];
        int ind = 0;
        for (int i = 0, j = 0; i < rem.length; i++) {
            if (i != ind) {
                bago[j] = rem[i];
                j++;
            }
        }
        System.out.format(Arrays.toString(bago));
    }

}
