/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamdaExpression;

/**
 *
 * @author Reverside
 */

public class LamdaMain {

    public static void main(String[] args) {
       
        int width=10;
        
        drawable d2=()->{
        
            System.out.println("Drawing "+width);
        };
        
        d2.draw();
    }
    
    
    
}
