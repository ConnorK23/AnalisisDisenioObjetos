/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.menu;

/**
 *
 * @author dapda
 */
public class ExitCommand extends Command {
    private boolean closed;
	
	protected ExitCommand() {
		super("Salir");
		this.reset();
	}

	@Override
	public void execute() {
		ticket.close();
		closed = true;
	}

	public boolean closed() {
		return closed;
	}
	
	public void reset() {
		closed = false;
	}
}
