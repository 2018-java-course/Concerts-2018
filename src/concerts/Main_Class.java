/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerts;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventDatabase;
import calendar.api.CalendarEventException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC21
 */
public class Main_Class implements CalendarEventDatabase {

    ArrayList<Concert> myArrayList = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }

    @Override
    public void populate(ArrayList<CalendarEvent> events) {
        for (CalendarEvent item : events) {

            Concert tmpConcert;
            try {
                tmpConcert = new Concert(item.getTitle(), item.getStartDate(), item.getEndDate(), item.getLocation(), item.getCategory());
            } catch (CalendarEventException ex) {
                Logger.getLogger(Main_Class.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Errore luogo evento, ne imposto uno di default!");
                tmpConcert = new Concert(item.getTitle(), item.getStartDate(), item.getEndDate(), "Default location", item.getCategory());
            }

            this.myArrayList.add(tmpConcert);
        }

    }

}
