/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.ticket;

import java.util.Date;

/**
 *
 * @author dapda
 */
public class Header {
    private Date date;
	
	public Header() {
		date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}

	@Override
	public String toString() {
		return "Head [date=" + date + "]";
	}
}
