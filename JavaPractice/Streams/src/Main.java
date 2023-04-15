import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("1st Example - ");
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println("");

        System.out.print("2nd Example - ");
        IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
        System.out.println("");

        System.out.print("3rd Example - ");
        System.out.println(IntStream.range(1, 5).sum());

        System.out.print("4th Example - ");
        Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

        System.out.print("5th Example - ");
        String [] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika"};
        Arrays.stream(names) // Same as Stream.of(names)
                .filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

        System.out.print("6th Example - ");
        Arrays.stream(new int[] {2, 4, 6, 8, 10}).map(x -> x*x).average().ifPresent(System.out::println);

        System.out.println("7th Example - ");
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "Amanda", "Hans", "Shivani");
        people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);

//        System.out.println("8th Example - ");
//        Stream<String> bands = Files.lines(Paths.get("band.txt"));
//        bands.sorted().filter(x -> x.length() > 8).forEach(System.out::println);
//        bands.close();

//        System.out.println("9th Example - ");
//        List<String> band2 = Files.lines(Paths.get("band.txt")).filter(x -> x.contains("Shree")).collect(Collectors.toList());
//        band2.forEach(System.out::println);

//        System.out.println("10th Example - ");
//        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
//        int rowCount = (int)rows1.map(x -> x.split(",")).filter(x -> x.length == 3).count();
//        System.out.println(rowCount + " rows.");
//        rows1.close();

//        System.out.println("11th Example - ");
//        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
//        rows2.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15).forEach(x -> System.out.println(x[0] + " "+ x[1] + " "+ x[2]));
//        rows2.close();

//        System.out.println("12th Example - ");
//        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
//        Map<String, Integer> map = new HashMap<>();
//        map = rows3.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
//                .collect(Collectors.toMap(
//                        x->x[0],
//                        x->Integer.parseInt(x[1])
//                ));
//        rows3.close();
//        for(String key : map.keySet()){
//            System.out.println(key + " " + map.get(key));
//        }

        System.out.println("13th Example - ");
        double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a+b);
        System.out.println("Total = "+ total);

        System.out.println("14th Example - ");
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
        System.out.println(summary);
    }
}