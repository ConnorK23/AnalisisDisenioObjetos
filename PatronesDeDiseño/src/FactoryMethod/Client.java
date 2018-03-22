/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author dapda
 */
public class Client {
    public void exec() {
        int code = IO.instance().readInt("Introduzca el codigo: ");
        int amount = IO.instance().readInt("Introduzca la cantidad: ");
        
        IO.instance().writeln("Codigo: " + code);
        IO.instance().writeln("Cantidad: " + amount);    
    }
    
    public static void main(String[] args) {
        new Client().exec();
    }
}
