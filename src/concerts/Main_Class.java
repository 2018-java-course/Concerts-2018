/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerts;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import concerts.utils.EclipseTools;
import java.util.ArrayList;

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
        EclipseTools.fixConsole();

        ArrayList<CalendarEvent> myArrayList = new ArrayList<>();

        Populator populator = new Populator();
        populator.populate(myArrayList);

        myArrayList.sort((o1, o2) -> {
            return o1.getStartDate().compareTo(o2.getStartDate());
        });
        
        myArrayList.forEach((calendarEvent) -> {
            System.out.println(((Concert) calendarEvent).getDescription());
        });

    }
}
