package Airlines;

import java.util.Arrays;
import java.util.Optional;

public class Flights {

    public Object[] getAirlines(Airline[] airlines, String flightTo){

        Optional<Airline[]> optionalAirlines = Optional.ofNullable(airlines);

        if (optionalAirlines.isPresent())
        {
            return Arrays.stream(optionalAirlines.get()).filter(airline -> airline.getFlightTo().equals(flightTo)).toArray();
        }
        else return optionalAirlines.get();



    }

    public Object[] getAirlines(Airline[] airlines, PlaneType planeType)
    {
        Optional<Airline[]> optionalAirlines = Optional.ofNullable(airlines);

        if (optionalAirlines.isPresent())
        {
            return Arrays.stream(optionalAirlines.get()).filter(airline -> airline.getPlaneType().equals(planeType)).toArray();
        }
        else return optionalAirlines.get();

    }

}
