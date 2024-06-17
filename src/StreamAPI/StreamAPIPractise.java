package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIPractise {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");

        List<String> ans= input.stream().filter(word -> word.startsWith("a")).
                map(word -> word.toUpperCase()).
                collect(Collectors.toList());

          System.out.println(ans);


        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, -1, 4, 10, 12);
             Optional<Integer> minValue = numbers.stream().min((n1, n2) -> Integer.compare(n1,n2));

             if(minValue.isPresent()){
                 System.out.println(minValue.get());
             }else {
                 System.out.println("empty");
             }

            int value = numbers.stream().reduce(Integer.MAX_VALUE,(n1, n2 )-> Math.min(n1,n2));
        System.out.println(value);



        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
          int MinValue=   numbers2.stream().reduce(0,(n1,n2)-> n1+n2);
          System.out.println(MinValue);


        List<String> input1 = Arrays.asList("a", "bb", "ccc", "d", "ee", "fff");

        Map<Integer, List<String>> answer =input1.stream().collect(Collectors.groupingBy(s->s.length()));

        for( Integer key : answer.keySet()){
            System.out.println("the key is " + key +" the values "+answer.get(key));
        }


       List<Integer> evenNumber = IntStream.rangeClosed(0,10).boxed().filter(number -> number %2 ==0).
                collect(Collectors.toList());
        System.out.println(evenNumber);


        List<String> input3 = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
        Optional<String > ans4 = input3.stream().filter(word -> word.contains("e")).findFirst();
        System.out.println(ans4.get());


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );


      List<Integer> singleList =  listOfLists.stream().flatMap(list ->list.stream()).
                collect(Collectors.toList());
        System.out.println(singleList);


        List<String> input4 = Arrays.asList("one", "two", "three", "four", "five", "six");
        List<String> ans5 = input4.stream().filter(word -> word.length() >=3).
                 collect(Collectors.toList());
        System.out.println(ans5);


        List<Integer> numbers5 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> ans6 =  numbers5.stream().distinct().collect(Collectors.toList());
        System.out.println(ans6);

        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");

      List<String> combinedString =  Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
      System.out.println(combinedString);





    }
}
