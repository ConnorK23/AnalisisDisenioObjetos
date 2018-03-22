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
public class Footer {
    private int totalPrice;
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "Footer [totalPrice=" + totalPrice + "]";
	}
}
