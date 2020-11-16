/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import fu.MathUtility;

/**
 *
 * @author Admin
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long expected =120;//t hi vong 120 return ve
       long actual = MathUtility.GetFactorial(5);// neu t goi ham 5!
        System.out.println("5!?Exxcepted:" + expected+";Actual"+actual);
       //excepted:720 if tinh 6!
       expected = 720;
       actual = MathUtility.GetFactorial(6);
        System.out.println("6!?Exxcepted:" + expected+";Actual"+actual);
        //excepted:1 if tinh 0!
        System.out.println("0!:"+MathUtility.GetFactorial(0));
         //excepted:-5 IllegalArgurmentException if tinh  if tinh -5!
         // neu t goi ve -5!
        MathUtility.GetFactorial(-5);
        // cat code
    }
    
}
