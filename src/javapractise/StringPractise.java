package javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPractise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while(true){
            String input = sc.nextLine();

            List<String> words = Arrays.asList(input.split(" "));

            System.out.println(words.size());

       }
    }
}