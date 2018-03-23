/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author dapda
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("algorithmInterface por ConcreteStrategyA");
    }
    
}
