import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    public HotelService(){
        hotels.add(new Hotel(2000, 2, HotelType.THREE_STAR));
        hotels.add(new Hotel(1000, 1, HotelType.THREE_STAR));
        hotels.add(new Hotel(10000, 4, HotelType.FOUR_STAR));
        hotels.add(new Hotel(20000, 5, HotelType.FIVE_STAR));
        hotels.add(new Hotel(5000, 3, HotelType.FOUR_STAR));
    }

    public List<Hotel> filterHotelsLessThan(Predicate<Hotel> filter){
        List<Hotel> filterHotels = new ArrayList<>();

        for(Hotel hotel : hotels){
            if(filter.test(hotel))
                filterHotels.add(hotel);
        }
        return filterHotels;
    }
}
