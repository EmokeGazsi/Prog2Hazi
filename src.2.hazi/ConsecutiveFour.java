/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emőke
 */
public class ConsecutiveFour {
    public static void main(String[] args) {
        int [] t={1,2,3,3,3,3,4};
        
        System.out.println(isConsecutiveFour(t));
        
    }
    public static boolean isConsecutiveFour(int []values){
        if(values.length>4){
            for(int i=0;i<values.length-3;i++){
                if(values[i]==values[i+1] && values[i+1]==values[i+2] && values[i+2]==values[i+3]){
                    return true;
                }
               
                    
            }
            return false;
        }
        else
            return false;
    }
}
