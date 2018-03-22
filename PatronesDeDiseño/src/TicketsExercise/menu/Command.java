/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.menu;

import TicketsExercise.ticket.Ticket;

/**
 *
 * @author dapda
 */
public abstract class Command {
    private String title;
	
	protected Ticket ticket;
	
	protected Command(String title) {
		this.title = title;
	}
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract void execute();
}
