
package group4_act1_cc103;

//@author Anne Polina
 
public class totalsGr4 {
    //Declare the instance variables
    private double dblOrderGr4 = 0, dblPattyGr4 = 0, dblColesGr4  = 0, dblCheeseGr4 = 0, dblDrinksGr4 = 0;
    private double dblTotalGr4;
    
    //Create constructor with parameters
    public totalsGr4(double orderGr4, double pattyGr4, double colesGr4, double cheeseGr4, double drinksGr4){
        dblOrderGr4 = orderGr4;
        dblPattyGr4 = pattyGr4;
        dblColesGr4 = colesGr4;
        dblCheeseGr4 = cheeseGr4;
        dblDrinksGr4 = drinksGr4;
    }
    //Create the compute method or function
    public double computeGr4(){
        dblTotalGr4 = dblOrderGr4 + dblPattyGr4 + dblColesGr4 +dblCheeseGr4 + dblDrinksGr4;
        return dblTotalGr4;
    }
}
