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
public abstract class Performer {
    
    public String nome;
    public double cachet;

    public Performer (String nome, double cachet) {
        
        this.nome = nome;
        this.cachet = cachet;
        
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
}
