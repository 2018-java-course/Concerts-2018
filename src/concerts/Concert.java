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
    private Performer performer;

    @Override
    public String toString() {
        return "Nome: " + nomeConcerto + "\n"
                + "Inizio: " + dataInizio + "\n"
                + "Fine: " + dataFine + "\n"
                + "Luogo: " + luogo + "\n"
                + "Categoria: " + categoria + "\n"
                + "Performer: " + performer;
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

    public String getLuogo() {
        return luogo;
    }

    /**
     *
     * @return Luogo
     * @throws CalendarEventException
     */
    @Override
    public String getLocation() throws CalendarEventException {

        if (this.luogo.equals("")) {
            this.luogo = "Unknown location";

            throw new CalendarEventException("La location è vuota per " + this.nomeConcerto);
        }

        return this.luogo;
    }

    public String getLocationSafe() {
        try {
            return this.getLocation();
        } catch (CalendarEventException ex) {
            System.err.println("Errore getLocation(), il luogo verrà impostato e sostituito con Unknown Location");
        }

        this.luogo = "Unknown location";
        return this.luogo;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    public static class Builder {

        private final Concert concert;

        public Builder() {
            this.concert = new Concert();
            this.concert.nomeConcerto = "Nome da costruttore";
            this.concert.luogo = "Luogo concerto da costruttore";
            this.concert.dataInizio = LocalDate.now().plusDays(1);
            this.concert.dataFine = LocalDate.now().plusDays(4);
            this.concert.categoria = "Categoria da costruttore";
            this.concert.performer = new Solista("Solista da costruttore", 1.0);
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

        public Builder setPerformer(Performer performer) {
            this.concert.performer = performer;
            return this;
        }

        public Concert build() {
            return this.concert;
        }

    }

}
