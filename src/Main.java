import Airlines.Airline;
import Airlines.Flights;
import Airlines.PlaneType;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Airline [] airlines = new Airline[5];

        airlines[0] = new Airline("Moscow", 278431, PlaneType.Airbus, new GregorianCalendar(2022, 3, 14));
        airlines[1] = new Airline("Kiev", 354121, PlaneType.Boing, new GregorianCalendar(2022, 4, 23));
        airlines[2] = new Airline("Warsaw", 101022, PlaneType.Mriya, new GregorianCalendar(2022, 1, 7));
        airlines[3] = new Airline("Berlin", 639010, PlaneType.Airbus, new GregorianCalendar(2022, 8, 24));
        airlines[4] = new Airline("London", 568723, PlaneType.Tupolev, new GregorianCalendar(2022, 7, 15));
        Flights flights = new Flights();

        for (Object o: flights.getAirlines(airlines, PlaneType.Airbus)
             ) {
            System.out.println(o);
        }



    }
}
