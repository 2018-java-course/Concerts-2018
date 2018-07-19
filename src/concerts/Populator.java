/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerts;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventDatabase;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author PC21
 */
public class Populator implements CalendarEventDatabase {
    
    @Override
    public void populate(ArrayList<CalendarEvent> events) {      
        
        Concert concertoNapoli = new Concert.Builder()
                .setCategoria("Pop")
                .setDataFine(LocalDate.now().plusDays(1))
                .setDataInizio(LocalDate.now())
                .setLuogo("Napoli")
                .setNomeConcerto("Pizza Fest")
                .build();
                
        Concert concertoVenezia = new Concert.Builder()
                .setCategoria("Metal")
                .setDataFine(LocalDate.now().plusDays(8))
                .setDataInizio(LocalDate.now())
                .setLuogo("Venezia")
                .setNomeConcerto("Laguna Fest")
                .build();
        
        Concert concertoRoma = new Concert.Builder()
                .setCategoria("Folk")
                .setDataFine(LocalDate.now().plusDays(3))
                .setDataInizio(LocalDate.now())
                .setLuogo("Roma")
                .setNomeConcerto("Colosseum Art")
                .build();
        
        Concert concertoMilano = new Concert.Builder()
                .setCategoria("Rock")
                .setDataFine(LocalDate.now().plusDays(4))
                .setDataInizio(LocalDate.now())
                .setLuogo("Milano")
                .setNomeConcerto("Smog Fest")
                .build();
        
        Concert concertoUnknown = new Concert.Builder()
                .setCategoria("Indie")
                .setDataFine(LocalDate.now().plusDays(3))
                .setDataInizio(LocalDate.now())
                .setLuogo("")
                .setNomeConcerto("Sballo Fest")
                .build();
        
        events.add(concertoNapoli);
        events.add(concertoVenezia);
        events.add(concertoUnknown);
        events.add(concertoRoma);
        events.add(concertoMilano);
        

    }
}
