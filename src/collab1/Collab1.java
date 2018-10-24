/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collab1;

import java.text.DecimalFormat;

/**
 *
 * @author cem17
 */
public class Collab1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double answer = compoundInterest(0.025, 10000, 365, 4, 0);
       DecimalFormat df = new DecimalFormat("$###,###.##");
       System.out.println(df.format(answer));
       System.out.println("Michan forked this project.");
    }
    // i = interest | p = principle | c = compound | t = time(years) | a = amount/total
    public static double compoundInterest(double i, double p, double c, double t, double a) {
        a = p;
        double exp = c*t;
        double par = (1+(i/c));
        double last = Math.pow(par, exp);
        a = p*last;
        return a;
    }
}
