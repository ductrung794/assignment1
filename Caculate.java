/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe;

public class Caculate {
    private Double caculate(SIGN sign, Double arg1, Double arg2){
        switch (sign) {  
            case Plus: 
                return arg1 + arg2;        
            case Minus: 
                return arg1 - arg2;       
            default:
                break;
        }
        return 0d;
    }
}
