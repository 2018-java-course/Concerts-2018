/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerts;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author PC21
 */
public class Concert implements CalendarEvent {
    
    
    public String nomeConcerto;
    public LocalDate dataInizio;
    public LocalDate dataFine;
    public String luogo;
    public String categoria;
//    public Performer performer;
    
    public Concert(String nomeConcerto, LocalDate dataInizio, LocalDate dataFine, String luogo, String categoria) {
        
        this.nomeConcerto = nomeConcerto;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.luogo = luogo;   
        this.categoria = categoria;
//        this.performer = performer;
        
    }
    
    
    
    
    
    
    //Ciao da Giulio, ho appena fatto 2 commit ^_^   
    
    
    @Override
    public String getTitle() {
        return this.nomeConcerto;
    }

    @Override
    public LocalDate getStartDate() {
        return this.dataInizio;
    }

    @Override
    public LocalDate getEndDate() {
        return this.dataFine;
    }

    @Override
    public String getCategory() {
        return this.categoria;
    }

    @Override
    public String getLocation() throws CalendarEventException {
        return this.luogo;
    }

    
}
