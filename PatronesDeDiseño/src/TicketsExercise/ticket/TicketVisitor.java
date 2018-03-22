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
public interface TicketVisitor {
    void visit(Header head);
	
	void visit(SaleLine saleLine);
	
	void visit(RepetitionLine repetitionLine);
	
	void visit(CancellationLine cancellationLine);
	
	void visit(ReturnLine returnLine);

	void visit(Footer footer);
}
