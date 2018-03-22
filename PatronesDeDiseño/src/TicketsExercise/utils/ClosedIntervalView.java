/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.utils;

/**
 *
 * @author dapda
 */
public class ClosedIntervalView {
    private String title;
    private ClosedInterval closedInterval;
	
    public ClosedIntervalView(String title, ClosedInterval closedInterval){
	assert title != null;
	assert closedInterval != null;
	this.title = title;
	this.closedInterval = closedInterval;
    }
	
    public void writeln() {
	IO.instance().writeln(title + " " + this.toString());
    }
	
    @Override
    public String toString() {
    	return "[" + closedInterval.getMin() + ", " + closedInterval.getMax() + "]";
    }
}
