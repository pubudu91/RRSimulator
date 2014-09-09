/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package etherealcodelin.model;

/**
 *
 * @author Pubudu
 */
public class Process {
    private int pid;    // Process ID
    private String name;    // Name of the process
    private int duration;   // Total CPU time required for this process to finish execution
    
    public Process(int pid, String name, int duration){
        this.pid = pid;
        this.name = name;
        this.duration = duration;
    }
    
    public int getPID(){
        return pid;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public String toString(){
        return "[ "+pid+": "+name+", "+duration+" ]";
    }
}
