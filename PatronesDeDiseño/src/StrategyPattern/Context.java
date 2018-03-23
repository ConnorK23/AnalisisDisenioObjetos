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
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void contextInterface() {
        System.out.println("pre-strategy");
        strategy.algorithmInterface();
        System.out.println("post-strategy");
    }
}
