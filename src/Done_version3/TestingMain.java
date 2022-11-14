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
public class TestingMain {

    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();

        EmployeeRoster1 roster1 = new EmployeeRoster1();

        roster1.countHourlyEmployee();
        roster1.displayHourlyEmployee();
//        roster1.countCommisionEmployee();
//        roster1.displayCommisionEmployee();
//        roster1.countBasePlusCommisionEmployee();
//        roster1.displayBasePlusCommisionEmployee();
//        roster1.countPieceWorkerEmployee();
//        roster1.displayPieceWorkerEmployee();
        roster1.displayEmployee();
        roster1.showAddEmployee();

//        roster1.removeEmployee(1234);
//          System.out.println("After Adding new Employee:\n" + Arrays.toString(roster1.addEmployee()));  
//        roster.countHourlyEmployee();
//        roster.displayHourlyEmployee();
//        roster.countCommisionEmployee();
//        roster.displayCommisionEmployee();
//        roster.countBasePlusCommisionEmployee();
//        roster.displayBasePlusCommisionEmployee();
//        roster.countPieceWorkerEmployee();
//        roster.displayPieceWorkerEmployee();
//        roster.addEmployee();
//        roster.removeEmployee();
//        roster.displayEmployee();
    }

}
