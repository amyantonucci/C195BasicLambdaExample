/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195basiclambdaexample;

/**
 *
 * @author amy.antonucci
 */
public abstract class C195BasicLambdaExample implements Welcome {

    
    public static void main(String[] args) {
        Welcome w = new Welcome() {
            @Override
            public void greeting() {
                System.out.println("Hello from method!");
            }
        };
        
        Welcome w1 = () -> System.out.println("Hello from lambda!");
        w.greeting();
        w1.greeting();
    }

    
   
    
}
 
    interface Welcome {
        void greeting();
    }

