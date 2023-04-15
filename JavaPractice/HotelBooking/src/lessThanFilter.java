import java.util.function.Predicate;

public class lessThanFilter implements Predicate<Hotel> {

    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight() <= 10000;
    }
}
