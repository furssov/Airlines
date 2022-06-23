package Airlines;

import Airlines.PlaneType;

import java.util.Calendar;

public class Airline {
    private String flightTo;
    private int flightNumber;
    private PlaneType planeType;
    private Calendar calendar;

    public Airline(String flightTo, int flightNumber, PlaneType planeType, Calendar calendar) {
        this.flightTo = flightTo;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.calendar = calendar;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Airlines.Airline{" +
                "flightTo='" + flightTo + '\'' +
                ", flightNumber=" + flightNumber +
                ", planeType=" + planeType +
                ", calendar=" + calendar.getTime() +
                '}';
    }
}
