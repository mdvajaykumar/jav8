package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExamples {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for(int i=0; i<Arr.size(); i++){
            System.out.println(Arr.get(i));
        }

        for(Integer num : Arr){
            System.out.println(num);
        }

        //using lambda Expression
        Arr.forEach(number -> System.out.println("Using lambda " + number));

        // creating a thread

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is running");
            }
        };

        Thread t1 = new Thread(run);

        t1.start();

        // By using Lambda

        Runnable run2 = () ->{
            System.out.println("thread is creating by using lambda Expression ");
        };


        Thread t2 = new Thread(run2);
        t2.start();



    }
}
