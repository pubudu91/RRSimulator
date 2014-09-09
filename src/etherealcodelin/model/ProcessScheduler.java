/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package etherealcodelin.model;

import etherealcodelin.utilities.ECQueue;

/**
 *
 * @author Pubudu
 */
public class ProcessScheduler {
    private ECQueue<Process> queue; // Queue for holding all the processes to be executed
    
    public ProcessScheduler(){
        queue = new ECQueue<Process>();
    }
    
    public void addProcess(Process p){
        queue.offer(p);
    }
}
