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
public class Client {
    private void exec() {
        Context context;
        
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
    
    public static void main(String[] args) {
        new Client().exec();
    }
}
