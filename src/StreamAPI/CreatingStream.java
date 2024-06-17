package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    // how many ways can we create Strean

    // from ArrayList
    // for collection you can use .stream() to create a Stream();
    List<String> myList = Arrays.asList("a", "b", "c");
    Stream<String> stream = myList.stream();



    // for Arrays
    String[] myArray = {"a", "b", "c"};
    Stream<String> stream1 = Arrays.stream(myArray);

    Stream<String> stream2 = Stream.of(myArray);

     // from String how can we create Stream
     String str = "a, b, c";
    Stream<String> stream3 = Stream.of(str.split(","));
    Stream<String> stream4 = Arrays.stream(str.split(","));

}
