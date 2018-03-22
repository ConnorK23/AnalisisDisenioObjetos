/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.store;

/**
 *
 * @author dapda
 */
public class Product {
    private int price;
	
	@SuppressWarnings("unused")
	private int stock;
	
	public Product(int price, int units) {
		this.price = price;
		this.stock = units;
	}
	
	public int getPrice(int units) {
		return price*units;
	}
	
	public void add(int units){
		this.stock += units;
	}
	
	public void remove(int units){
		this.stock -= units;
	}
}
