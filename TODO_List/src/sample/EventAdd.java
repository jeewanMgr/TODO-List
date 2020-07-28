package sample;
import javafx.scene.control.Button;

import java.time.LocalDate;
public class EventAdd {
    private String yourEvent;
    private LocalDate date;
    private Button edit;

    public EventAdd(LocalDate date, String yourEvent)
    {
        this.date = date;
        this.yourEvent = yourEvent;

    }


    public String getYourEvent() {
        return yourEvent;
    }

    public void setYourEvent(String yourEvent) {
        this.yourEvent = yourEvent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String toString()
    {
        return "Date: "+ date +" " + yourEvent;
    }
}
