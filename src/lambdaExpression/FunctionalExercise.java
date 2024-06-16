package lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalExercise {
    public static void main(String[] args) {

        //some most frequently used Functional Interfaces

        //Function uses apply method;
        Function<Integer, String> convertor = (num)->Integer.toString(num);

        System.out.println(convertor.apply(345));

        //Consumer  uses acceptMethod
        Consumer<String> consumerTest = (s1)-> System.out.println(s1 +"Received Value");

        consumerTest.accept("Ajay");

        //Supplier Uses  get Method
        Supplier<String> supplierTest = () ->"Exploring Functional Interface";

        System.out.println(supplierTest.get());

    }
}
