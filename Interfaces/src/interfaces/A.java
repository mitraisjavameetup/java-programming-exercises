/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author joci
 */
public class A implements Actings, Actings2 {

   // clas cann implemnt more than one interface
    public static void main(String[] args) {
        
        
       A aObj = new A();
        
        aObj.walking();
        aObj.sellepin();
        aObj.eating();
        aObj.running();
       
    }
    // since A class implements Acting interface, the A class MUST override the interface methods
    @Override
    public void walking() {
        System.out.println("Walking");  
    }

    @Override
    public void sellepin() {
        System.out.println("sleeping");
    }

    @Override
    public void eating() {
        System.out.println("eating");          
    }
    
    @Override
    public void running() {
        System.out.println("running");
    }
    
    
    
}
