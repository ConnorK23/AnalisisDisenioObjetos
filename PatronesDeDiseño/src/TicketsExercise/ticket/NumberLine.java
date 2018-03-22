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
public abstract class NumberLine extends Line {
    protected int number;
	
	protected NumberLine(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[number=" + number + super.toString() + "]\n";
	}
}
