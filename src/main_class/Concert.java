/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author PC21
 */
public class Concert implements Eventable {
    
    public String nomeConcerto;
    public Date dataInizio;
    public Date dataFine;
    
    public String luogo;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LocalDate getStartDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LocalDate getEndDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}