import java.util.ArrayList;

public class Test4 {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hotdog");
        food.add("sushi");

        food.set(1,"hej");

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}
