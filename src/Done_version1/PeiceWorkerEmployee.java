/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version1;

/**
 *
 * @author Student.Admin
 */
public class PeiceWorkerEmployee {
    int empID;
    String empName;
    double totalPiecesFinished;
    double ratePerPiece;
    
    //    This is a default constructor
    public PeiceWorkerEmployee(){
        empID = 0; 
        empName = "No Name";
        totalPiecesFinished = 0.0;
        ratePerPiece = 0.0;
        
    }
    
    //    this is a constructor with parameters
    public PeiceWorkerEmployee(int empID, String empName, double totalPiecesFinished, double ratePerPiece){
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public double getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(double totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    //displayInfo method
    public void displayInfo(){
        System.out.println(this);
//        PieceWorkerEmployee p1,
//        p2, p3 , p4, p5;
//        
//        p1 = new PieceWorkerEmployee(); //I am using the default constructor
//        p2 = new PieceWorkerEmployee(1234, "Joan Maceda", 300, 1.5); //I am using the constructor with parameters
//        p3 = new PieceWorkerEmployee (5678, "John Doe", 500.0, 1);
//        p4 = new PieceWorkerEmployee ();
//        p5 = new PieceWorkerEmployee(9123, " John Del", 200.0, 0.5);
//        
//        p1.setEmpName("Bernadez");
//        p4.setEmpName("Ortiz");
// 
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
        
        
    }
    
    //    computeSalary method
    public double computeSalary(){
        double add = (totalPiecesFinished /100);
        double value =(int)add * 100;//converting the double into integer to get the whole number
        
        if (totalPiecesFinished  >= 100)
            return (ratePerPiece *totalPiecesFinished)+ (value * 10);
        else
            return ratePerPiece * totalPiecesFinished;
        
    }
    
    @Override
    public String toString(){
        return "ID = " + this.empID + "\nName = " 
                + this.empName + "\nFinished Pieces = " + this.totalPiecesFinished +  "\nRate Per Piece =  " + this.ratePerPiece + "\nTotal Wage = Php "+this.computeSalary()+ "\n";
    }
}
