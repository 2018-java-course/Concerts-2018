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

/**
 *
 * @author PC21
 */
public class Populator implements CalendarEventDatabase {

    @Override
    public void populate(ArrayList<CalendarEvent> events) {

        Concert concertoNapoli = new Concert.Builder()
                .setCategoria("Pop")
                .setDataFine(LocalDate.now().plusDays(4))
                .setDataInizio(LocalDate.now().plusDays(2))
                .setLuogo("Napoli")
                .setNomeConcerto("Pizza Fest")
                .setPerformer(new Solista("Nino D'Angelo", 10.0))
                .build();

        Concert concertoVenezia = new Concert.Builder()
                .setCategoria("Metal")
                .setDataFine(LocalDate.now().plusDays(8))
                .setDataInizio(LocalDate.now().plusDays(3))
                .setLuogo("Venezia")
                .setNomeConcerto("Laguna Fest")
                .setPerformer(new Band("Metallica", 100_000, 5))
                .build();

        Concert concertoRoma = new Concert.Builder()
                .setCategoria("Folk")
                .setDataFine(LocalDate.now().plusDays(8))
                .setDataInizio(LocalDate.now().plusDays(6))
                .setLuogo("Roma")
                .setNomeConcerto("Colosseum Art")
                .setPerformer(new Solista("Giorgia", 1_000.0))
                .build();

        Concert concertoMilano = new Concert.Builder()
                .setCategoria("Rock")
                .setDataFine(LocalDate.now().plusDays(4))
                .setDataInizio(LocalDate.now().plusDays(1))
                .setLuogo("Milano")
                .setNomeConcerto("Smog Fest")
                .setPerformer(new Band("Kiss", 123_000, 4))
                .build();

        Concert concertoUnknown = new Concert.Builder()
                .setCategoria("Indie")
                .setDataFine(LocalDate.now().plusDays(9))
                .setDataInizio(LocalDate.now().plusDays(7))
                .setLuogo("")
                .setNomeConcerto("Sballo Fest")
                .setPerformer(new Solista("Lucio Battisti", 1_000_000.0))
                .build();

        events.add(concertoNapoli);
        events.add(concertoVenezia);
        events.add(concertoUnknown);
        events.add(concertoRoma);
        events.add(concertoMilano);

        events.forEach((calendarEvent) -> {
            try {
                if (calendarEvent instanceof Concert) {
                    String ignored = ((Concert) calendarEvent).getLocation();
                }
            } catch (CalendarEventException ex) {
                System.out.println("Il concerto "
                        + ((Concert) calendarEvent).getTitle()
                        + " non ha impostato un luogo, verrà impostato a "
                        + ((Concert) calendarEvent).getLuogo());
            }
        });


    }
}
