/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.queues;

/**
 *
 * @author Lancer-Matrix
 */
public class CallCenterSimulator {
    private static final int NUMBER_OF_ARGS = 4;
    private static final int NUMBER_OF_AGENTS_ARG = 0;
    private static final int NUMBER_OF_CALLS_ARG = 1;
    private static final int MAX_CALL_DURATION_ARG = 2;
    private static final int MAX_CALL_INTERVAL_ARG = 3;
    
    private CallCenterSimulator(){
    }
    
    public static void main(String [] args){
        assert args != null : "args can't be null";
        
        if(args.length != NUMBER_OF_ARGS){
            System.out.println("Usage: CallGenerator <numberOfAgents>"
                    +" <numberOfCalls> <maxCallDuration>"
                    +" <maxCallInterval");
            System.exit(-1);
        }
        
        CallCenter callCenter = 
                new CallCenter(Integer.parseInt(args[NUMBER_OF_AGENTS_ARG]));
        
        CallGenerator callGenerator = 
                new CallGenerator(callCenter,
                                Integer.parseInt(args[NUMBER_OF_CALLS_ARG]),
                                Integer.parseInt(args[MAX_CALL_DURATION_ARG]),
                                Integer.parseInt(args[MAX_CALL_INTERVAL_ARG]));
        
        callCenter.open();
        try{
            callGenerator.generateCalls();
        }finally{
            callCenter.close();
        }
    }
}
