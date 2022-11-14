/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version2;

/**
 *
 * @author Student.admin
 */
public class TestingMain {
    public static void main(String[] args){
        
        
        Employee[] emp = new Employee [4];
        
        emp[0] = new HourlyEmployee(10_000, 45, 1234, "Joann Maceda");
        emp[1] = new CommisionEmployee(30_000, 0.10, 4567, "Joemar Bernadez");
        emp[2] = new BasePlusCommisionEmployee(10_000, 30_000.0, 0.1, 4567, "Joemar Bernadez");
        emp[3] = new PeiceWorkerEmployee(219, 25, 1345, "Jovet Maceda");
        
        for (Employee employ : emp) {
            System.out.println(employ);
        }
        
        for(Employee employ : emp) {
            System.out.println(String.format("%s - Php %,.2f", employ.getEmpName(), employ.computeSalary()));
        }
//        //For Hourly Employees
//        
//        System.out.println("These are Hourly Employee:");
//        HourlyEmployee[] he = new HourlyEmployee [5];
//             
//        he[0] = new HourlyEmployee(10_000, 45, 1234, "Joann Maceda");
//        he[1] = new HourlyEmployee (10_000, 50, 4567, "Joemar Bernadez");
//        he[2] = new HourlyEmployee (10_000.0, 60.0, 8976, "Jhondel Maceda");
//        he[3] = new HourlyEmployee (10_000, 40, 5432, "Joshua Maceda");
//        he[4] = new HourlyEmployee (10_000, 56, 1345, "Jovet Maceda");
//        
//        
//        for (HourlyEmployee hem : he){
//            System.out.println(hem);
//        }
//        
//        //For Commision Employee
//        
//        System.out.println("\n These are Commission Employee:");
//        CommisionEmployee[] ce = new CommisionEmployee [5];
//             
//        ce[0] = new CommisionEmployee(10_000, 0.05, 1234, "Joann Maceda");
//        ce[1] = new CommisionEmployee (30_000, 0.10, 4567, "Joemar Bernadez");
//        ce[2] = new CommisionEmployee (55_000.0, 0.15, 8976, "Jhondel Maceda");
//        ce[3] = new CommisionEmployee (105_000, 0.30, 5432, "Joshua Maceda");
//        ce[4] = new CommisionEmployee (15_000, 0.1, 1345, "Jovet Maceda");
//        
//        
//        for (CommisionEmployee cem : ce){
//            System.out.println(cem);
//        }
//        
//        //For Base plus Commision Employee
//        
//        System.out.println("\n These are for Base Plus Commission Employee:");
//        BasePlusCommisionEmployee[] be = new BasePlusCommisionEmployee [5];
//             
//        be[0] = new BasePlusCommisionEmployee(10_000,10_000, 0.05, 1234, "Joann Maceda");
//        be[1] = new BasePlusCommisionEmployee (10_000, 30_000, 0.10, 4567, "Joemar Bernadez");
//        be[2] = new BasePlusCommisionEmployee (10_000, 55_000.0, 0.15, 8976, "Jhondel Maceda");
//        be[3] = new BasePlusCommisionEmployee (10_000, 105_000, 0.30, 5432, "Joshua Maceda");
//        be[4] = new BasePlusCommisionEmployee (10_000, 15_000, 0.1, 1345, "Jovet Maceda");
//        
//        
//        for (BasePlusCommisionEmployee bem : be){
//            System.out.println(bem);
//        }
//        
//        //For Base plus Commision Employee
//        
//        System.out.println("\n These are for Piece Worker Employee:");
//        PeiceWorkerEmployee[] pe = new PeiceWorkerEmployee [5];
//             
//        pe[0] = new PeiceWorkerEmployee(310, 25, 1234, "Joann Maceda");
//        pe[1] = new PeiceWorkerEmployee (122, 25, 4567, "Joemar Bernadez");
//        pe[2] = new PeiceWorkerEmployee (95, 25,8976, "Jhondel Maceda");
//        pe[3] = new PeiceWorkerEmployee (100, 25, 5432, "Joshua Maceda");
//        pe[4] = new PeiceWorkerEmployee (219, 25, 1345, "Jovet Maceda");
//        
//        
//        for (PeiceWorkerEmployee pem : pe){
//            System.out.println(pem);
//        }
    }
}
