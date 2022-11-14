/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version1;

/**
 *
 * @author Student.Admin
 */
public class TestingMain {
        public static void main(String[] args){
        //For Hourly Employees
        
        System.out.println("These are Hourly Employee:");
        HourlyEmployee[] he = new HourlyEmployee [5];
             
        he[0] = new HourlyEmployee( 1234, "Joann Maceda",10_000, 45);
        he[1] = new HourlyEmployee (4567, "Joemar Bernadez", 10_000, 50 );
        he[2] = new HourlyEmployee ( 8976, "Jhondel Maceda",10_000.0, 60.0);
        he[3] = new HourlyEmployee ( 5432, "Joshua Maceda", 10_000, 40);
        he[4] = new HourlyEmployee (1345, "Jovet Maceda", 10_000, 56 );
        
        
        for (HourlyEmployee hem : he){
            System.out.println(hem);
        }
        
        //For Commision Employee
        
        System.out.println("\n These are Commission Employee:");
        CommisionEmployee[] ce = new CommisionEmployee [5];
             
        ce[0] = new CommisionEmployee( 1234, "Joann Maceda", 10_000, 0.05);
        ce[1] = new CommisionEmployee ( 4567, "Joemar Bernadez",30_000, 0.10);
        ce[2] = new CommisionEmployee ( 8976, "Jhondel Maceda", 55_000.0, 0.15);
        ce[3] = new CommisionEmployee ( 5432, "Joshua Maceda", 105_000, 0.30);
        ce[4] = new CommisionEmployee ( 1345, "Jovet Maceda", 15_000, 0.1);
        
        
        for (CommisionEmployee cem : ce){
            System.out.println(cem);
        }
        
        //For Base plus Commision Employee
        
        System.out.println("\n These are for Base Plus Commission Employee:");
        BasePlusCommisionEmployee[] be = new BasePlusCommisionEmployee [5];
             
        be[0] = new BasePlusCommisionEmployee(1234, "Joann Maceda", 10_000,10_000, 0.05);
        be[1] = new BasePlusCommisionEmployee (4567, "Joemar Bernadez", 30_000, 10_000, 0.10);
        be[2] = new BasePlusCommisionEmployee ( 8976, "Jhondel Maceda", 55_000.0, 10_000, 0.15);
        be[3] = new BasePlusCommisionEmployee ( 5432, "Joshua Maceda", 105_000, 10_000, 0.30);
        be[4] = new BasePlusCommisionEmployee (1345, "Jovet Maceda", 15_000,10_000, 0.1);
        
        
        for (BasePlusCommisionEmployee bem : be){
            System.out.println(bem);
        }
        
        //For Base plus Commision Employee
        
        System.out.println("\n These are for Piece Worker Employee:");
        PeiceWorkerEmployee[] pe = new PeiceWorkerEmployee [5];
             
        pe[0] = new PeiceWorkerEmployee(1234, "Joann Maceda", 310, 25  );
        pe[1] = new PeiceWorkerEmployee (4567, "Joemar Bernadez",122, 25  );
        pe[2] = new PeiceWorkerEmployee (8976, "Jhondel Maceda", 95, 25);
        pe[3] = new PeiceWorkerEmployee (5432,"Joshua Maceda", 100, 25 );
        pe[4] = new PeiceWorkerEmployee (1345,"Jovet Maceda", 219, 25 );
        
        
        for (PeiceWorkerEmployee pem : pe){
            System.out.println(pem);
        }
    }
}
