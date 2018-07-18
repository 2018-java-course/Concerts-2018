/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerts;

/**
 *
 * @author PC21
 */
public class Band extends Performer {
    
    public int numComponenti;
    
    public Band(String nome, double cachet, int numComponenti) {
        
        super(nome, cachet);
        this.numComponenti = numComponenti;
    }
    
    
}
