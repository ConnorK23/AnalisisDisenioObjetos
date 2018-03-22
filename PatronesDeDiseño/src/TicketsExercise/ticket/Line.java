/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.ticket;

/**
 *
 * @author dapda
 */
public abstract class Line {
    protected int price;
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public abstract void accept(TicketVisitor ticketVisitor);

	@Override
	public String toString() {
		return ", price=" + price;
	}
}
