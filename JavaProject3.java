/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject3;

/**
 *
 * @author TAU
 */
public class JavaProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassExample mark = new ClassExample("Mark");
        ClassExample lesley = new ClassExample("Lesley");
        
        mark.bff = lesley;
        
        mark.introduce();
        lesley.introduce();
        
        System.out.println(mark.getGrade());
        mark.study(3);
        // TODO code application logic here
    }
    
}
