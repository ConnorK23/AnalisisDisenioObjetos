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
public class SaleLine extends IdLine {
    public SaleLine(int id, int units) {
		super(id, units);
	}
	
	@Override
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "SaleLine " + super.toString();
	}
}
