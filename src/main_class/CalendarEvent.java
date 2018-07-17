/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class;

import java.time.LocalDate;

/**
 *
 * @author claudio
 */
public interface CalendarEvent {
    public String getTitle();
    public LocalDate getStartDate();
    public LocalDate getEndDate();
    public String getCategory();
}
