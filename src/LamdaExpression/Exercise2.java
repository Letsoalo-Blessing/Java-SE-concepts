/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamdaExpression;

interface Sayble{

    public String say();
}
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sayble s=()->{
            
            return "Blessing";
    };
       
        System.out.println(s.say());
    }
    
}
