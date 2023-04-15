import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        List<Hotel> filteredHotels = hotelService.filterHotelsLessThan( (Hotel hotel) -> {
            return hotel.getPricePerNight() <= 10000;
        });
        for(Hotel hotel : filteredHotels){
            System.out.println(hotel.pricePerNight);
        }

        List<Integer> lst = List.of(1,2,3,4,5);

        // Consumer.
        Consumer<Integer> consumer = a -> System.out.println(a);
        lst.forEach(consumer);

        // Supplier
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        // Function<input, output>
        Function<String, Integer> function = (string) -> string.length();
        System.out.println(function.apply("Shreyash"));
    }
}