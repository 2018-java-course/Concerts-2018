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
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<CalendarEvent> myArrayList = new ArrayList<>();
        
        Populator populator = new Populator();
        
        populator.populate(myArrayList);
        
        System.out.println("Array popolato: " + myArrayList);


    }

    

}
