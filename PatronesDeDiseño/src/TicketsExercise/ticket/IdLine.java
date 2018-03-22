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
public class IdLine extends Line{
    protected int id;

	protected int units;

	protected IdLine(int id, int units) {
		this.id = id;
		this.units = units;
	}
	
	public int getId() {
		return id;
	}
	
	public int getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", units=" + units + super.toString() + "]\n";
	}

    @Override
    public void accept(TicketVisitor ticketVisitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
