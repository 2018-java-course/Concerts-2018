/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerts;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import calendar.api.Displayable;
import java.time.LocalDate;

/**
 *
 * @author PC21
 */
public class Concert implements CalendarEvent, Displayable {
    
    private String nomeConcerto;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private String luogo;
    private String categoria;
//  public Performer performer;
    
//    private Concert(String nomeConcerto, LocalDate dataInizio, LocalDate dataFine, String luogo, String categoria) {
//        
////        this.nomeConcerto = nomeConcerto;
////        this.dataInizio = dataInizio;
////        this.dataFine = dataFine;
////        this.luogo = luogo;   
////        this.categoria = categoria;
//////      this.performer = performer;
//        
//    }
//    
    
    private Concert () {
        
    }
    
    
    @Override
    public String toString() {
        return  "Nome: "+nomeConcerto + "\n" +
                "Inizio: "+dataInizio + "\n" +
                "Fina: "+dataFine + "\n" +
                "Luogo: "+luogo + "\n" +
                "Categoria: "+categoria + "\n";
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

    @Override
    public String getDescription() {
        return this.toString();
    }

    
    public static class Builder {
        
        private Concert concert;
        
        public Builder() {
            this.concert = new Concert();
        }
        
        public Builder setNomeConcerto(String nomeConcerto) {
            this.concert.nomeConcerto = nomeConcerto;
            return this;
        }

        public Builder setDataInizio(LocalDate dataInizio) {
            this.concert.dataInizio = dataInizio;
            return this;
        }

        public Builder setDataFine(LocalDate dataFine) {
            this.concert.dataFine = dataFine;
            return this;
        }

        public Builder setLuogo(String luogo) {
            this.concert.luogo = luogo;
            return this;
        }

        public Builder setCategoria(String categoria) {
            this.concert.categoria = categoria;
            return this;
        }

        public Concert build() {
            return this.concert;
        }
    
        
    }
}
