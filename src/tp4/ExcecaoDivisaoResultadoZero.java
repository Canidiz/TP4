/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author pmigu
 */
public class ExcecaoDivisaoResultadoZero extends Exception {
    @Override
    public String getMessage(){
        return "O resultado da divisão é 0";
    }
    
}
