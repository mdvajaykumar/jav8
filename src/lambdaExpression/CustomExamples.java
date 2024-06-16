package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;


public class CustomExamples {
    public static void main(String[] args) {
        ArrayList<Food> foodList  =new ArrayList<>();
        foodList.add(new Food(1,"rice",1));
        foodList.add(new Food(4,"Sambar",3));
        foodList.add(new Food(3,"water",2));
        foodList.add(new Food(6,"hotWater",8));

        Collections.sort(foodList,(f1, f2) ->{
            return f1.name.compareTo(f2.name);
        });

        foodList.forEach(food -> System.out.println(food.id +" " +food.name +" "+ food.price));
    }
}
