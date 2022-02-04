import java.util.Random;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {



        for(int i = 0; i <= 10 ; i++){
            Random random = new Random();
            int number = random.nextInt(10)+1;
            System.out.println(number);

        }
    }
}
