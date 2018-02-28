/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import baseclasses.InstructionBase;
import baseclasses.LatchBase;

/**
 * Definitions of latch contents for pipeline registers.  Pipeline registers
 * create instances of these for passing data between pipeline stages.
 * 
 * AllMyLatches is merely to collect all of these classes into one place.
 * It is not necessary for you to do it this way.
 * 
 * You must fill in each latch type with the kind of data that passes between
 * pipeline stages.
 * 
 * @author 
 */
public class AllMyLatches {
    public static class FetchToDecode extends LatchBase {
        // LatchBase already includes a field for the instruction.
    	
    	DcDst = FtchDst;
    	//here we will partition the instruction into valuable information.
    	//so we will have instruction type and source and destination registers stored in an array.
    	
    	//use this array to store the values in the Fetch related variables.
    	//now store assign the appropriate Fetch variables to the Decode variables here.
    	
    	
    	
    }
    
    public static class DecodeToExecute extends LatchBase {
        // LatchBase already includes a field for the instruction.
        // What else do you need here?
    	
    	//Here we will use the string comparison to determine the instruction type(like +,-,*,/,STORE,MUL etc)
    	//and also break the Fetch variables to extract information about the register numbers(lile R1 broken to 1 and we know its the first register)
    }
    
    public static class ExecuteToMemory extends LatchBase {
        // LatchBase already includes a field for the instruction.
        // What do you need here?
    	
    	//this is the ALU stage and here the actual mathematical operations will be done(like add r1 = r2 + r3)
    	
    }

    public static class MemoryToWriteback extends LatchBase {
        // LatchBase already includes a field for the instruction.
        // What do you need here?
    	
    	//here the values computed from ExecuteToMemory would be transferred to the designated register
    }    
}
