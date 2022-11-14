/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Done_version2;

/**
 *
 * @author Student.admin
 */
public class PeiceWorkerEmployee extends Employee{
    double totalPiecesFinished;
    double ratePerPiece;

    public PeiceWorkerEmployee(double totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PeiceWorkerEmployee(double totalPiecesFinished, double ratePerPiece, int empID, String empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
    
    @Override
    public void displayInfo(){
        System.out.println(this);
    }
    
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
        return "-----For Peice Worker Employees:\n" + "ID = " +super.empID + "\nName = " 
                + super.empName + "\nFinished Pieces = " + this.totalPiecesFinished +  "\nRate Per Piece =  " + this.ratePerPiece + "\nTotal Wage = Php "+this.computeSalary()+ "\n";
    }
}
