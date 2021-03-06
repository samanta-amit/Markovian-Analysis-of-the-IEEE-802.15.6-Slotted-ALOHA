/* Computation of idle duration
 *
 *
 * Initial simulation code from Amit Samanta (IIT Kharagpur).
 *
 * Author:
 *
 *	Amit Samanta <amit.samanta049@gmal.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 */

package com.slottedaloha;

public class computation_of_idle_duration {

	static double [] idle  = new double[8];
	static double [] active  = new double[8];

	public void idle_duration_computation() {
		
		computation_for_retransmission retransmission = new computation_for_retransmission();
		retransmission.retransmission_compuation();

		System.out.println("\n\nCompuation of idle state : ");
		for(int i=0; i<=7; i++) {
			active [i] = computation_for_retransmission.retransmission[i] / computation_of_frame_transmission.tau[i];
			idle [i] = (active[i]*(1-computation_of_frame_transmission.tau[i]))/(computation_of_frame_transmission.tau[i]);
			//System.out.print( active[i] + "\t");
			System.out.print( idle[i] + "\t");
		}
	}

	public static void main (String [] arguments){
		computation_of_idle_duration idle_duration = new computation_of_idle_duration();
		idle_duration.idle_duration_computation();
	}

}
